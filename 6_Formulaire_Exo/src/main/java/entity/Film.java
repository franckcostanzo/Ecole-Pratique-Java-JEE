package entity;

public class Film {
	
	private String titre;
	private String realisateur;
	private boolean estVu;
	private String typeFilm;
	
	public String getTypeFilm() {
		return typeFilm;
	}

	public void setTypeFilm(String typeFilm) {
		this.typeFilm = typeFilm;
	}

	public boolean isEstVu() {
		return estVu;
	}
	
	public void setEstVu(boolean estVu) {
		this.estVu = estVu;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	
	
}
