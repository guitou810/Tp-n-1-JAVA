import java.util.Date;

public class Concepteur extends Salarie {

	private int AnneeDev;
	
	public Concepteur(int code, String nom, String prenom, String url, Date date,int anneeDev) {
		super(code, nom, prenom, url, date);
		AnneeDev = anneeDev;
	}


	public int getAnneeDev() {
		return AnneeDev;
	}


	public void setAnneeDev(int anneeDev) {
		AnneeDev = anneeDev;
	}

	
	@Override
	public String toString() {
		return ("{Concepteur code:" + this.getCode() + "\nNom :" + this.getNom().toString() + "\nPrenom :" + this.getPrenom().toString() + "\nUrl :" + this.getUrl().toString() + "\nDate :" + this.getDate() + "\nAnnée de développement :" + AnneeDev + "}" );
	}

}
