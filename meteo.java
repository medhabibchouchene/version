package com.agence.gee;
import java.util.*;
public class meteo {
	protected Date date;
	protected String description;

	meteo(){ 
	try {
		date = new Date();
	    Scanner LireClavier = new Scanner(System.in);
	    System.out.println("veuillez saisir la date de départ"); 
	    System.out.println("donner la Date: ");
	    date.saisir_date();
	    System.out.println(" donner la Description");
	    description = LireClavier.next(); 
	} catch (InputMismatchException LE) {
	    System.out.println("entree detectee est invalide");
	  
	}
	}
}