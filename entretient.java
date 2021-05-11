package com.agence.gee;
import java.util.*;
public class entretient {
	protected int id_avion;

	protected Date date;
	protected double heure;
	protected boolean entretient ; 
	entretient(){ 
	try {
	    Scanner LireClavier = new Scanner(System.in);
	    date = new Date();
	    System.out.println("donner la Id_avion: ");
	    id_avion = LireClavier.nextInt();
	    System.out.println(" donner la Date");
	    date.saisir_date();
	    System.out.println("donner l'Heure: ");
	    heure = LireClavier.nextDouble();
	    System.out.println("Entretient: ");
	    entretient = LireClavier.nextBoolean();   
	} catch (InputMismatchException LE) {
	    System.out.println("entree detectee est invalide");  
	}}}