package com.agence.gee;
import java.util.*;

public class avion {

    protected int id ;
    protected String destination;
    protected Date datedep;
    protected Date dateret;
    protected Time heuredep;
    protected Time heureret;
    protected int nbnuit;
    protected int nbjours;
    protected String numvol;
    protected String avion;
    protected String description ;
    protected double prix;
    protected String type;


    public void saisir() {
        Scanner LireClavier = new Scanner(System.in);
        try {
            System.out.println("donner l'id: ");
            id= LireClavier.nextInt();
            System.out.println("veuillez saisir la date de depart");
            datedep = new Date();
            System.out.println("veuillez saisir la date de retour");
            dateret = new Date();
            System.out.println("veuillez saisir l'heure de depart");
            heuredep = new Time();
            System.out.println("veuillez saisir l'heure de retour");
            heureret = new Time();
            System.out.println("donner le nombre de nuit ");
            nbnuit= LireClavier.nextInt();
            System.out.println("donner le nombre de jours ");
            nbjours= LireClavier.nextInt();
            System.out.println("donner le numeros de vol ");
            numvol= LireClavier.nextInt();
            System.out.println("donner le nom de l'avion  ");
            avion = LireClavier.next();
            System.out.println("donner la description  ");
            description = LireClavier.next();
            System.out.println("donner le prix  ");
            prix = LireClavier.nextdouble();
            System.out.println("donner le type  ");
            type = LireClavier.next();
           
            Connection cn =null;
    		Statement st =null;
    		int rs ;
            String url = "jdbc:mysql://localhost/agence de voiture";
    		String login = "root";
    		String passwd = "";
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
			cn = DriverManager.getConnection(url, login, passwd);

			
			st = cn.createStatement();
			try {
			String sql =  "INSERT INTO voyage  VALUES ("+id+","+destination+","+datedep+","+dateret+","+ heuredep+","+ heureret+","+ nbnuit+","+nbjours+","+numvol+","+avion+","+description+","+prix+","+type+")";
			rs = st.executeUpdate(sql);
		
    		cn.close();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
        
        }
    }
    }
