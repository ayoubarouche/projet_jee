package com.inpt.gestionecole.databaseControllers;

import java.sql.Connection;

import com.inpt.gestionecole.config.Connexion;

public class PlanningController {
	Connection conn;
	// here add the atributes that you will need view the
	// com.inpt.gestionecole.tests classes for exemple

	public PlanningController() {
		conn = Connexion.getConnection();
	}
	// here add the methods that you will need
}