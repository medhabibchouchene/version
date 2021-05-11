package com.agence.gee;
import java.util.*;

public class client {

    protected int id ;
    protected String nomprenom;
    protected Date datenaiss;
    protected String adresse;
    protected int numtel;
    protected int cin;
    protected int numpass;
    protected String nationalite;
    protected String mail;
    protected int idvoy;

    

    public void saisir() {
        Scanner LireClavier = new Scanner(System.in);
        try {
        	
            System.out.println("donner l'id: ");
            id= LireClavier.nextInt();
            System.out.println("donner le nom et le prenom: ");
            nomprenom = LireClavier.next();
            System.out.println("veuillez saisir la date de naissance");
            datenaiss = LireClavier.next();
            System.out.println("veuillez saisir l'adresse ");
            adresse = LireClavier.next();
            System.out.println("donner le num de telephone");
            numtel = LireClavier.nextInt();  
             System.out.println("veuillez le num cin");
            cin = LireClavier.NextInt()
            System.out.println("donner le num passport  ");
            numpass = LireClavier.nextInt();
            System.out.println("donner la nationalite  ");
            nationalite = LireClavier.next();
            System.out.println("donner le mail  ");
            mail = LireClavier.next();
            System.out.println("tester l'id voyage  ");
            idvoy = LireClavier.nextInt();
            
            Connection cn =null;
    		Statement st =null;
    		int rs ;
            String url = "jdbc:mysql://localhost/agence de voiture";
    		String login = "root";
    		String passwd = "";
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		
			// Etape 2 : recuperation de la connexion
			cn = DriverManager.getConnection(url, login, passwd);

			// Etape 3 : Creation d'un statement
			st = cn.createStatement();
			
			//requette pour ramener la fonction de l'emplyee :directeur ou agent
			
			// Etape 4 : execution requete
			String sql =  "INSERT INTO client  VALUES ("+id+","+nomprenom+","+datenaiss+","+adresse+","+ numtel+","+ cin+","+ numpass+","+nationalite+","+ mail","+ idvoy")";
			rs = st.executeUpdate(sql);
		
    		cn.close();
        } catch (InputMismatchException LE) {
            System.out.println("entree detectee est invalide");
        
        }
    }