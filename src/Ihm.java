import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ihm {

	private String saisie1;
	private String saisie2;
	private String saisie3;

	ArrayList <Concepteur> listeConcepteur = new ArrayList <Concepteur>() ;
	ArrayList <Analyste> listeAnalyste = new ArrayList <Analyste>() ;
	ArrayList <Salarie> listeSalarie = new ArrayList <Salarie>();
	
	ListeConcepteur listeC = new ListeConcepteur(listeConcepteur);
	ListeAnalyste listeA = new ListeAnalyste(listeAnalyste);
	ListeSalarie listeSal = new ListeSalarie(listeAnalyste,listeConcepteur,listeSalarie);
	
	/* ON rempli les listes concepteur et analyste */
	public void initialise() {
		Date date1 =  new Date();
		Concepteur salarie2 = new Concepteur(2,"Dax","Guillaume","http/test",date1,4);
		Analyste salarie3 = new Analyste(1,"Costes","Quentin","Http/testst",date1,5);
		listeC.addElement(listeConcepteur, salarie2);
		listeA.addElement(listeAnalyste, salarie3);
	}
	
	/* Constructeur */
	public Ihm() {
		super();
	}
	
	/* MENU */
	public void chargement_menu() throws IOException, ParseException {
		System.out.println("--------------------MENU----------------------");
		System.out.println("Tapez Concepteur OU Analyste Ou Salarie");
	    BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
	    saisie1 = entree.readLine();
		this.chargement_inter1(saisie1);
	}
	
	/* ETAPE n°1 */
	public void chargement_inter1(String choix) throws IOException, ParseException {
		switch (choix) {
		case "Concepteur":
			System.out.println("--------------------ETAPE n°1----------------------");
			System.out.println("Tapez 1 Ajoutez un Concepteur");
			System.out.println("Tapez 2 Supprimer un Concepteur");
			System.out.println("Tapez 3 listez les Concepteurs");
			System.out.println("Tapez 4 Retour Menu");
		    BufferedReader entree2 = new BufferedReader(new InputStreamReader(System.in));
			saisie2 = entree2.readLine();
			this.chargement_inter2(saisie1,saisie2);
		break;
		case "Analyste":
			System.out.println("--------------------ETAPE n°1----------------------");
			System.out.println("Tapez 1 Ajoutez un Analyste");
			System.out.println("Tapez 2 Supprimer un Analyste");
			System.out.println("Tapez 3 listez les Analystes");
			System.out.println("Tapez 4 Retour Menu");
		    BufferedReader entree3 = new BufferedReader(new InputStreamReader(System.in));
		    saisie2 = entree3.readLine();
			this.chargement_inter2(saisie1,saisie2);
		break;
		case "Salarie":
			System.out.println("--------------------ETAPE n°1----------------------");
			System.out.println("Tapez 3 listez les Salariés");
			System.out.println("Tapez 4 Retour Menu");
		    BufferedReader entree5 = new BufferedReader(new InputStreamReader(System.in));
		    saisie2 = entree5.readLine();
			this.chargement_inter2(saisie1,saisie2);
		break;
		default:
			System.out.println("Erreur dans la saisie");
			this.chargement_menu();
		break;
		}
	}
	
	/* ETAPE n°2 */
	public void chargement_inter2(String choix,String choix2) throws IOException, ParseException {
		switch (choix2) {
		case "1":
			System.out.println("--------------------ETAPE n°2----------------------");
			System.out.println("Saisir le code, nom, prénom, url, date d’embauche(dd/MM/yyyy) et nombre d’année de développement ");
		    BufferedReader entree3 = new BufferedReader(new InputStreamReader(System.in));
		    saisie3 = entree3.readLine();
		    this.chargement_inter3(choix, choix2, saisie3);
		break;
		case "2":
			System.out.println("--------------------ETAPE n°2----------------------");
			System.out.println("Saisir le code :");
		    BufferedReader entree4 = new BufferedReader(new InputStreamReader(System.in));
		    saisie3 = entree4.readLine();
		    this.chargement_inter3(choix,choix2,saisie3);
		break;
		case "3":
			System.out.println("--------------------ETAPE n°2----------------------");
			if (choix.equals("Concepteur")) {
				System.out.println(listeC.getListeS());
				this.chargement_inter1(choix);
			}else if (choix.equals("Analyste")) {
				System.out.println(listeA.getListeS());
				this.chargement_inter1(choix);
			}else {
				System.out.println(listeSal.getListeS());
				this.chargement_inter1(choix);
			}
		break;
		case "4":
			this.chargement_menu();
		break;
		default:
			System.out.println("Erreur de saisi");
			this.chargement_menu();
		}
	}
	
	/* ETAPE n°3 */
	public void chargement_inter3(String choix, String choix2, String choix3) throws ParseException, IOException {
		switch(choix) {
		case "Concepteur":
			if (choix2.equals("1")) {
				String[] donnees = choix3.split(",");
				int code=Integer.parseInt(donnees[0]);
				if (listeC.iscodeExist(listeConcepteur, code)) {
					this.chargement_menu();
				}else {
					int anneeDev=Integer.parseInt(donnees[5]);
					Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(donnees[4]);
					Concepteur salarie1 = new Concepteur(code, donnees[1], donnees[2], donnees[3],date1, anneeDev);
					listeC.addElement(listeConcepteur, salarie1);
					System.out.println("Concepteur ajouter");
					this.chargement_inter1(choix);
				}
			}else {
				int code=Integer.parseInt(choix3);
				listeC.supprElement(listeConcepteur, code);
				System.out.println("Concepteur supprimer");
				this.chargement_inter1(choix);
			}
		case "Analyste":
			if (choix2.equals("1")) {
				String[] donnees = choix3.split(",");
				int code=Integer.parseInt(donnees[0]);
				if (listeA.iscodeExist(listeAnalyste, code)){
					this.chargement_inter1(choix);
				}else {
					int nbrDepCli=Integer.parseInt(donnees[5]);
					Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(donnees[4]);
					Analyste salarie1 = new Analyste(code, donnees[1], donnees[2], donnees[3],date1, nbrDepCli);
					listeA.addElement(listeAnalyste, salarie1);
					System.out.println("Analyste ajouter");
					this.chargement_inter1(choix);
				}
			}else {
				int code=Integer.parseInt(choix3);
				listeA.supprElement(listeAnalyste, code);
				System.out.println("Analyste supprimer");
				this.chargement_inter1(choix);
			}
		}
		
	}

}
