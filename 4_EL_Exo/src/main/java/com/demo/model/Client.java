package com.demo.model;

import java.util.List;

public class Client {

	private String nom;
	private String prenom;
	private Integer age;
	private List<String> adresse;
	
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	public List<String> getAdresses() {
		return adresse;
	}

	public void setAdresses(List<String> adresse) {
		this.adresse = adresse;
	}
	
	
}
