import java.util.ArrayList;
import java.util.Iterator;

public class ListeConcepteur {

	private ArrayList <Concepteur> listeS;
	private boolean cpt;
	
	
	public ListeConcepteur(ArrayList<Concepteur> listeS) {
		super();
		this.listeS = listeS;
	}


	public String getListeS() {
		return ("Liste des concepteurs :" + listeS );
	}


	public void setListeS(ArrayList<Concepteur> listeS) {
		this.listeS = listeS;
	}

	public void addElement (ArrayList<Concepteur> listeS,Concepteur C) {
		listeS.add(C);
	}
	
	public boolean iscodeExist (ArrayList<Concepteur> listeS,int code) {
		for(Concepteur concepteur : listeS) {
			if (concepteur.getCode() == code) {
				System.out.println("le code est déjà utilisé");
				return true;
			}
		}
		return false;
	}

	
	public void supprElement (ArrayList<Concepteur> listeS,int code) {
		for(Iterator<Concepteur> it = listeS.iterator() ; it.hasNext(); ) {
			if (it.next().getCode() == code) {
				it.remove();
				cpt = true;
			}
		}
		if (!cpt) {
			System.out.println("le code saisi n'existe pas");
		}
		
	}
	


}
