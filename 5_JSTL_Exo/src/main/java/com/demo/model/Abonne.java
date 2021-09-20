package com.demo.model;

import java.util.List;

public class Abonne {
	
	private String prenom;
	private String nom;
	private Integer typeAbonnement; 
	private String adresse;
	private List<Film> films;
	private Abonne abonneDuo;
	
	public Abonne getAbonneDuo() {
		return abonneDuo;
	}

	public void setAbonneDuo(Abonne abonneDuo) {
		this.abonneDuo = abonneDuo;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Integer getTypeAbonnement() {
		return typeAbonnement;
	}
	
	public void setTypeAbonnement(Integer typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	
}
