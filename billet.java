package com.agence.gee;
import java.util.*;

public class billet {
protected String referance;

protected String nom;
protected String prenom;
protected int num_Vol;
protected Date date;
billet(){ 
try {
    Scanner LireClavier = new Scanner(System.in);
    System.out.println("veuillez saisir les information a propos cette voyage");

    System.out.println("donner la Referance: ");
    referance = LireClavier.next();
    System.out.println(" donner le nom");
    nom = LireClavier.next();

    System.out.println("donner la prénom: ");
    prenom = LireClavier.next();

    System.out.println("donner le num de vol: ");
    num_Vol = LireClavier.nextInt();
    
} catch (InputMismatchException LE) {
    System.out.println("entree detectee est invalide");
  
}
}}
