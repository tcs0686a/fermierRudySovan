package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.entities.Ferme;

@Entity
public class Gerant implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idGerant;
	private String nom;
	private String prenom;
	@ManyToOne
	private Ferme ferme;
	
	public Gerant() {
	}
	public Gerant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Long getIdGerant() {
		return idGerant;
	}
	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
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
}
