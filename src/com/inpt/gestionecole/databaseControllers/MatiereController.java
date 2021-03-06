package com.inpt.gestionecole.databaseControllers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.inpt.gestionecole.config.HibernateSessionFactory;
import com.inpt.gestionecole.models.Matiere;

public class MatiereController {

	// here add the attributes that you will need view the
	// com.inpt.gestionecole.tests classes for example
	Session session = null;

	public MatiereController() {

	}

	public boolean add(Matiere m) {

		try {

			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(m);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			if (null != session.getTransaction()) {

				session.getTransaction().rollback();
				return false;
			}
		} finally {
			if (session != null) {
				;
				return true;
			}
		}
		return false;
	}

	public List<Matiere> allMatiere() {
		List<Matiere> matieres = new ArrayList<Matiere>();
		session = HibernateSessionFactory.buildSessionFactory().openSession();
		Query query = session.createQuery("from Matiere");
		matieres = query.list();

		return matieres;
	}

	public Matiere findMatierebyid(int ID_MATIERE) {
		Matiere M = null;
		try {
			session = HibernateSessionFactory.buildSessionFactory().openSession();

			M = (Matiere) session.get(Matiere.class, ID_MATIERE);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.close();
		}

		return M;

	}

	public boolean deleteMatiere(Matiere matiere) {
		try {
			session.close();
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.delete(matiere);

			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			if (null != session.getTransaction()) {

				session.getTransaction().rollback();
				return false;
			}
		} finally {
			if (session != null) {

				return true;
			}
		}
		return false;
	}

	public boolean updateMatiere(Matiere M) {
		try {
			session.close();
			session = HibernateSessionFactory.buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(M);

			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			if (null != session.getTransaction()) {

				session.getTransaction().rollback();
				return false;
			}
		} finally {
			if (session != null) {

				return true;
			}
		}
		return false;
	}
}
