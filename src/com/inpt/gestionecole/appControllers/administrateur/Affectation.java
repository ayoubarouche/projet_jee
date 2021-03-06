package com.inpt.gestionecole.appControllers.administrateur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inpt.gestionecole.databaseControllers.EnseignantController;
import com.inpt.gestionecole.databaseControllers.FiliereController;
import com.inpt.gestionecole.databaseControllers.MatiereController;
import com.inpt.gestionecole.models.Enseignant;
import com.inpt.gestionecole.models.Filiere;
import com.inpt.gestionecole.models.Matiere;

/**
 * Servlet implementation class Affectation
 */
@WebServlet("/administrateur/affectation")
public class Affectation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Affectation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("submit")==null) {
			try {
				affectationmatierebeforesubmit(request, response);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			try {
				affectationmatiereaftersubmit(request, response);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void affectationmatierebeforesubmit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("submit is null");
		EnseignantController ec = new EnseignantController();
		FiliereController fc = new FiliereController();
		MatiereController mc = new MatiereController();
		request.setAttribute("enseignantlist", ec.allEnseignant());
		request.setAttribute("filierelist", fc.allFiliere());
		request.setAttribute("matierelist", mc.allMatiere());
		
		getServletContext().getRequestDispatcher("/administrateur/affectation.jsp").forward(request, response);

	}
	public void affectationmatiereaftersubmit(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("submit not null");
		System.out.println("the id of filiere is " + request.getParameter("idf"));
		int idfiliere = Integer.parseInt(request.getParameter("idf"));
	int idmatiere = Integer.parseInt(request.getParameter("idm"));
		int idenseignant = Integer.parseInt(request.getParameter("ide"));
		FiliereController fc = new FiliereController();
		MatiereController mc = new MatiereController();
		EnseignantController ec = new EnseignantController();
		Filiere filiere = fc.findFilierebyid(idfiliere) ;
		if(filiere==null) {
			response.sendRedirect("/gestionecole/administrateur/matieres");
		return ;	
		}
		Matiere matiere = mc.findMatierebyid(idmatiere);
		if(matiere==null) {
			response.sendRedirect("/gestionecole/administrateur/matieres");
		return ;	
		}
		Enseignant enseignant = ec.findEnseignantbyid(idenseignant);
		if(enseignant==null) {
			response.sendRedirect("/gestionecole/administrateur/matieres");
		return ;	
		}
		enseignant.AddFiliereAndMatiere(filiere, matiere);
		response.sendRedirect("/gestionecole/administrateur/home_admin.jsp");
		
	}

}
