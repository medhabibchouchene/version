package com.agence.gee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
/**
 * @author wwmm
 *
 */
public class agent_commeciale {
    int id;
    String nom;
    String prenom;
    String login;
    String pass;
    String infagent;
    public agent_commeciale(int id, String nom, String prenom, String login, String pass, String infagent) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.pass = pass;
        this.infagent = infagent;
        
    }

public static void infagent(int id) {
        int id = 0;
        String nom = null;
        String prenom="null";
        String login="";
        String pass="";
        String infag=agent_commmeciale.infagent(id);
        StringTokenizer strk = new StringTokenizer(infag, " ");
         while (strk.hasMoreTokens()) { 
             id = Integer.parseInt(strk.nextToken());
             post = strk.nextToken();
         }
 
      // Information d'acces e la base de donnees

         String url = "jdbc:mysql://http://localhost/agence de voiture";
         String login = "root";
         String passwd = "";
         Connection cn =null;
         Statement st =null;
         ResultSet rs =null;     
         
         try {//db access
          // Etape 1 : Chargement du driver

             Class.forName("com.mysql.jdbc.Driver");
             // Etape 2 : recuperation de la connexion
             cn = DriverManager.getConnection(url, login, passwd);
             // Etape 3 : Creation d'un statement
             st = cn.createStatement();
             // Etape 4 : execution requete

             rs = st.executeQuery("SELECT * FROM agent commerciale WHERE id = "+id);
             while (rs.next()) {
            	 id= rs.getString("id");
            	 nom= rs.getString("nom");
                 prenom= rs.getString("prenom");
                 login= rs.getString("login");
                 pass  = rs.getString("pass");
             }//while
             System.out.println("L'agent  dont l'id "+id+" que son nom   "+nom+" et son prenom "
                     + prenom + " que son login :"+login+" et le password"+pass);
         }
         catch (SQLException e) {e.printStackTrace();} 
         catch (ClassNotFoundException e) {e.printStackTrace();}

         finally {
             try {
                 cn.close();
                 st.close();}
             catch (SQLException e) {e.printStackTrace();}
         }      
     }
 }
