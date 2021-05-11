package com.agence.gee;
import java.util.*;

public class avion {

    protected int id ;
    protected String nomav;
    protected int nbrc;
    protected int nbrcl;
    protected String description;
    protected Date datefab;
    protected int nbvl;
    protected int nbve;
    protected boolean active;
    protected boolean carburent;
    protected Date date_acquisition ;

    

    public void saisir() {
        Scanner LireClavier = new Scanner(System.in);
        try {
        	date_acquisition = new Date();
            System.out.println("donner l'id: ");
            id= LireClavier.nextInt();
            System.out.println("donner le nom d'avion: ");
            nomav = LireClavier.next();
            System.out.println("veuillez saisir le nombre de place commerciale");
            nbc = LireClavier.next();
            System.out.println("veuillez saisir le nombre de 1 er classe");
            nbcl = LireClavier.next();
            System.out.println("donner la description  ");
            description = LireClavier.next();  
             System.out.println("veuillez saisir la date de fabrication");
            datefab = new Date();
            System.out.println("donner le nombre de voyage limites   ");
            nbvl = LireClavier.nextInt();
            System.out.println("donner le nombre de voyage effectue  ");
            nbve = LireClavier.nextInt();
            System.out.println("donner l'active  ");
            active = LireClavier.nextBoolean();
            System.out.println("tester le carburant  ");
            carburent = LireClavier.nextBoolean();
            Connection cn =null;
    		Statement st =null;
    		int rs ;
            String url = "jdbc:mysql://localhost/agence de voiture";
    		String login = "root";
    		String passwd = "";
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
			cn = DriverManager.getConnection(url, login, passwd);

			
			st = cn.createStatement();
			
			String sql =  "INSERT INTO avion  VALUES ("+id+","+nomav+","+description+","+datefab+","+ nbvl+","+ nbve+","+ active+","+carburent+")";
			rs = st.executeUpdate(sql);
		
    		cn.close();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
        
        }
    }
