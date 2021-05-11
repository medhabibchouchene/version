package com.agence.gee;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vol {

    private String id_vol;
    private String nom_Avion;
    private String nbplace;
    private Date desc;
    protected Date date_vol ;
    private int nb_Voyage;
    private int nb_voyage_effectue;
    private boolean active;
    private boolean Carb;

    public void saisi_vol() {
        try {
            Scanner LireClavier = new Scanner(System.in);
            System.out.println("veuillez saisir les information a propos cette voyage");
            System.out.println("donner id de vol: ");
            id_vol = LireClavier.next();
            System.out.println("donner nom du vol: ");
            nom_Avion = LireClavier.next();
            System.out.println("donner dates : ");
            desc =  new Date();
            desc.saisir_date();
            System.out.println("veuillez saisir la date de vol");
            date_vol = new Date();
            date_vol.saisir_date();
            System.out.println("nombre de voyage ");
            nb_Voyage = LireClavier.nextInt();
            System.out.println("nombre de voyage a effectue ");
            nb_voyage_effectue = LireClavier.nextInt();
            System.out.println("Active ");
            active = LireClavier.nextBoolean();
            System.out.println("Carburent ");
            Carb = LireClavier.nextBoolean();
 
            ///***requette de saisie
          
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
          
        }
    }

    }