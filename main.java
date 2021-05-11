import com.agence.gee;

    public static void main(String[] args) {
        
        System.out.println("Bonjour");
        System.out.println("[Pour ajouter un voyage tapez -> A]");
        System.out.println("[Pour modifier un voyage tapez -> M]");
        System.out.println("[pour afficher un voyage tapez -> F]"); 
        System.out.println("[pour Supprimer un employee -> SUPP]");
        

        Traitementvoyage t = new Traitementvoyage();

        System.out.println("Veuillez saisir votre choix :");
        String choix = t.nextLine();
        String modif = t.nextLine();
        switch(choix) {
        
          case "A":
              
                System.out.println("Veuillez saisir votre id :");
                int id = t.nextInt();
                
                System.out.println("Ajout voyage \nSasit les information demandee en respectant la sturcture ci dessous en separant par virgule");
                System.out.println("idvoy,destination,date depart,date retour ,heure depart, heure retour,nombre nuits, nombre jours , numero vol,description ,prix, type");
                String inf = t.nextLine();
                serviceagence.ajoutVoyage(inf);
                //scanString.close();
                break;

         
          case "M":
        	  public static void modifier (int id ,String destination,,Date datedep,Date dateret,Time heuredep,Time heureret,int nbnuit,int nbjours,String numvol,String avion,String description ,double prix,String type) {
        	        
        	        String url = "jdbc:mysql://localhost/formation";
        	        String login = "root";
        	        String passwd = "";
        	        Connection cn =null;
        	        Statement st =null;
        	        String poste=verifEmp(id);
        	        
        	        try {
        	        
        	            
        	            Class.forName("com.mysql.jdbc.Driver");
    	                cn = DriverManager.getConnection(url, login, passwd);

        	            st = cn.createStatement();
        	            String query="UPDATE `"+voyage+"` SET `id` = '"+id+"' WHERE (`destination` = "+distination", `datedep` = "+date_depart", `dateret` = "+date_retour", `heuredep` = "+heured_epart", `heureret` = "+heureret", `nbnuit` = "+nbnuit", `nbjours` = "+nbjours", `numvol` = "+numvol", `avion` = "+avion", `description` = "+discription", `prix` = "+prix", `type` = "+type");
        	            
        	            st.executeUpdate(query);
        	            
        	        
        	        }//try
        	        
        	        catch (SQLException e) {e.printStackTrace();} //erreur sql
        	        catch (ClassNotFoundException e) {e.printStackTrace();} 

        	        finally {

        	            try {/
        	                cn.close();
        	                st.close();} 
        	            catch (SQLException e) {e.printStackTrace();}
        	        }
        	    }
                      
                  break;  
            
          case "":  
              System.out.println("La liste des Formations est :");
              TraitementFormation.listerFormation();
              
              break;
          case "SUPP":  
        	  public static void supprimer voyage (int id) {
        	        // Information d'acces e la base de donnees
        	        String url = "jdbc:mysql://localhost/formation";
        	        String login = "root";
        	        String passwd = "";
        	        Connection cn =null;
        	        Statement st =null;
        	        
        	        String poste=verifvoyage(id);
        	        
        	        try {
        	            Class.forName("com.mysql.jdbc.Driver"); 
        	            cn = DriverManager.getConnection(url, login, passwd);
        	            st = cn.createStatement();
        	            String queryad = "delete from "+voyage+" where id="+id;
        	            String queryemp = "delete from voyage where id="+id;
        	            st.executeUpdate(queryad);
        	            st.executeUpdate(queryemp);
        	            
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
              
         
          case "f":  
        	  public static void afficher(int id) 
        	  {    
        	        String url = "jdbc:mysql://localhost/formation";
        	        String login = "root";
        	        String passwd = "";
        	        Connection cn =null;
        	        Statement st =null;
        	        ResultSet rs =null;
        	        
        	        
        	        String poste=verifvoyage(id);
        	        
        	        try {
        	            Class.forName("com.mysql.jdbc.Driver");
        	            cn = DriverManager.getConnection(url, login, passwd);
        	            st = cn.createStatement();
        	            
        	            
        	            String query="SELECT  * FROM  `"+voyage+"`  ;
        	            
        	            rs = st.executeQuery(query);  
        	        }
        	        
        	        catch (SQLException e) {e.printStackTrace();} 
        	        catch (ClassNotFoundException e) {e.printStackTrace();} 

        	        finally {

        	            try {
        	                cn.close();
        	                st.close();} 
        	            catch (SQLException e) {e.printStackTrace();}
        	        }
        	        System.out.println("[Pour ajouter un client tapez -> C]");
        	        System.out.println("[Pour modifier un client tapez -> MC]");
        	        System.out.println("[pour afficher un client tapez -> FC]"); 
        	        Traitementvoyage ta = new Traitementvoyage();

        	        System.out.println("Veuillez saisir votre choix :");
        	        String choix = ta.nextLine();
        	        String modif = ta.nextLine();
        	        switch(choix) {
        	        
        	          case "C":
        	              
        	                System.out.println("Veuillez saisir votre id :");
        	                int id = ta.nextInt();
        	                
        	                System.out.println("Ajout un client \nSasit les information demandee en respectant la sturcture ci dessous en separant par virgule");
        	                System.out.println("id,nomprenom,datenaiss,adresse,numtel,cin,numpass,nationalite,mail,idvoyage");
        	                String inf = ta.nextLine();
        	                serviceagence.ajoutVoyage(inf);
        	                //scanString.close();
        	                break;

        	         
        	          case "MC":
        	        	  public static void modifier (int id, String nomprenom, Date datenaiss, String adresse, int numtel,int cin, int numpass,String nationalite,String mail,int idvoyage) {
        	        	        
        	        	        String url = "jdbc:mysql://localhost/formation";
        	        	        String login = "root";
        	        	        String passwd = "";
        	        	        Connection cn =null;
        	        	        Statement st =null;
        	        	        String poste=verifEmp(id);
        	        	        
        	        	        try {
        	        	        
        	        	            
        	        	            Class.forName("com.mysql.jdbc.Driver");
        	    	                cn = DriverManager.getConnection(url, login, passwd);

        	        	            st = cn.createStatement();
        	        	            String query="UPDATE `"+client+"` SET `id` = '"+id+"' WHERE (`nomprenom` = "+nomprenom", `datenaiss` = "+datenaiss", `adresse` = "+adresse", `numtel` = "+numtel", `cin` = "+cin", `nationalite` = "+nationalite", `mail` = "+mail", `idvoyage` = "+idvoyage");
        	        	            
        	        	            st.executeUpdate(query);
        	        	            
        	        	        
        	        	        }//try
        	        	        
        	        	        catch (SQLException e) {e.printStackTrace();} //erreur sql
        	        	        catch (ClassNotFoundException e) {e.printStackTrace();} 

        	        	        finally {

        	        	            try {/
        	        	                cn.close();
        	        	                st.close();} 
        	        	            catch (SQLException e) {e.printStackTrace();}
        	        	        }
        	        	    }
        	                      
        	                  break;  
 
        	          case "FC":  
        	        	  public static void afficher(int id) 
        	        	  {    
        	        	        String url = "jdbc:mysql://localhost/formation";
        	        	        String login = "root";
        	        	        String passwd = "";
        	        	        Connection cn =null;
        	        	        Statement st =null;
        	        	        ResultSet rs =null;
        	        	        
        	        	        
        	        	        String poste=verifclient(id);
        	        	        
        	        	        try {
        	        	            Class.forName("com.mysql.jdbc.Driver");
        	        	            cn = DriverManager.getConnection(url, login, passwd);
        	        	            st = cn.createStatement();
        	        	            
        	        	            
        	        	            String query="SELECT  * FROM  `"+client+"`  ;
        	        	            
        	        	            rs = st.executeQuery(query);  
        	        	        }
        	        	        
        	        	        catch (SQLException e) {e.printStackTrace();} 
        	        	        catch (ClassNotFoundException e) {e.printStackTrace();} 

        	        	        finally {

        	        	            try {
        	        	                cn.close();
        	        	                st.close();} 
        	        	            catch (SQLException e) {e.printStackTrace();}
        	        	        }
        	        	        public static void afficher2(int id) 
              	        	  {    
              	        	        String url = "jdbc:mysql://localhost/formation";
              	        	        String login = "root";
              	        	        String passwd = "";
              	        	        Connection cn =null;
              	        	        Statement st =null;
              	        	        ResultSet rs =null;
              	        	        
              	        	        
              	        	        String poste=verifclient(id);
              	        	        String poste1=verifvoyage(idvoyage)
              	        	        
              	        	        try {
              	        	            Class.forName("com.mysql.jdbc.Driver");
              	        	            cn = DriverManager.getConnection(url, login, passwd);
              	        	            st = cn.createStatement();
              	        	            
              	        	          System.out.println("afficher les infos du voyage d’un client choisit");
              	        	            String query="Select "idvoyage", "id "from "voyage as v ", "client as c" where "c.id=id "et" v.idvoyage=idvoyage" et "c.id=v.idvoyage"  ;
              	        	            
              	        	            rs = st.executeQuery(query);  
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
    