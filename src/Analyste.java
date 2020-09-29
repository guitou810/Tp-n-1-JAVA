import java.util.Date;

public class Analyste extends Salarie{

	private int NbrDepCli;
	
	
	public Analyste(int code, String nom, String prenom, String url, Date date,int nbrDepCli) {
		super(code, nom, prenom, url, date);
		this.setNbrDepCli(nbrDepCli);
	}


	public int getNbrDepCli() {
		return NbrDepCli;
	}


	public void setNbrDepCli(int nbrDepCli) {
		NbrDepCli = nbrDepCli;
	}


	@Override
	public String toString() {
		return ("{Analyste code:" + this.getCode() + "\nNom :" + this.getNom().toString() + "\nPrenom :" + this.getUrl().toString() + "\nUrl :" + this.getUrl().toString() + "\nDate :" + this.getDate() + "\nNombre de déplacement clients :" + NbrDepCli + "}" );
	}


}
