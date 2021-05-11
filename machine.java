
public class machine {
	import java.util.*;

	public class Machine {

	    protected String modele;
	    protected String constructeur;
	    protected Date date_acquisition;
	    protected float consommation;

	    public Machine() {
	        date_acquisition = new Date();
	    }

	    public void saisir_machine() {
	        Scanner LireClavier = new Scanner(System.in);
	        try {
	            System.out.println("donner le modele: ");
	            modele = LireClavier.next();
	            System.out.println("donner le nom du constructeur: ");
	            constructeur = LireClavier.next();
	            System.out.println("veuillez saisir la date d'acquisition");
	            date_acquisition = new Date();
	            date_acquisition.saisir_date();
	            System.out.println("donner la consommation de cette machine: ");
	            consommation = LireClavier.nextFloat();
	        } catch (InputMismatchException LE) {
	            System.out.println("entree detectee est invalide");
	        
	        }
	    } 

	    public void infos_machine() {
	        System.out.println("le modele est: " + modele);
	        System.out.println("le constructeur est: " + constructeur);
	        date_acquisition.infos_date();
	    }

	    public float consommation_machine() {
	        return consommation;
	    }

	    public String get_modele() {
	        return modele;
	    }
	}
}
