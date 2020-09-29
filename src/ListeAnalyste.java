import java.util.ArrayList;
import java.util.Iterator;

public class ListeAnalyste {

	private ArrayList <Analyste> listeS;
	private boolean cpt;

	public ListeAnalyste(ArrayList<Analyste> listeS) {
		super();
		this.listeS = listeS;
	}

	public String getListeS() {
		return ("Liste des Analystes :" + listeS);
	}

	public void setListeS(ArrayList<Analyste> listeS) {
		this.listeS = listeS;
	}

	public void addElement (ArrayList<Analyste> listeS,Analyste C) {
		listeS.add(C);
	}
	
	public boolean iscodeExist (ArrayList<Analyste> listeS,int code) {
		for(Analyste analyste : listeS) {
			if (analyste.getCode() == code) {
				System.out.println("le code est déjà utilisé");
				return true;
			}
		}
		return false;
	}
	
	
	public void supprElement (ArrayList<Analyste> listeS,int code) {
		for(Iterator<Analyste> it = listeS.iterator() ; it.hasNext(); ) {
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
