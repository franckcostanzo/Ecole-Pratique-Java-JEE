package com.demo.model;

public class Film {

	private String titre;
	private String realisateur;
	private Integer duree; 
	private Boolean estVu;
	
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
	
	public Integer getDuree() {
		return duree;
	}
	
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	
	public Boolean getEstVu() {
		return estVu;
	}
	
	public void setEstVu(Boolean estVu) {
		this.estVu = estVu;
	}
}
