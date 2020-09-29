import java.util.Date;


public class Salarie {

	private int code;
	private String nom;
	private String prenom;
	private String url;
	private Date date;
	

	
	public Salarie(int code, String nom, String prenom, String url, Date date) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.url = url;
		this.date = date;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


}
