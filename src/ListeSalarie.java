import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ListeSalarie {

	private ArrayList <Analyste> listeAnalyste;
	private ArrayList <Concepteur> listeConcepteur;
	private ArrayList <Salarie> listeSalarie;


	public ListeSalarie(ArrayList<Analyste> listeAnalyste, ArrayList<Concepteur> listeConcepteur, ArrayList<Salarie> listeSalarie) {
		super();
		this.listeAnalyste = listeAnalyste;
		this.listeConcepteur = listeConcepteur;
		this.listeSalarie = listeSalarie;
	}

	public String getListeS() {
		listeSalarie.addAll(listeAnalyste);/* concaténation liste salarie et liste Analyste */
		listeSalarie.addAll(listeConcepteur);/* concaténation liste salarie et liste concepteur */
		Collections.sort(listeSalarie,new Comparator<Salarie>() {/* tri de la liste salarie en fonction du code */
			@Override
			public int compare(Salarie o1, Salarie o2) {
				return o1.getCode() - o2.getCode();
			}
		});
		return ("Liste des salariés :" + listeSalarie);
	}

	public void setListeS(ArrayList<Salarie> listeSalarie) {
		this.listeSalarie = listeSalarie;
	}
	
	


}
