package com.example.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ferme implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFerme;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateAchat;
	@OneToMany(mappedBy = "ferme")
	@JoinColumn(name = "id_gerant")
	private List<Gerant> gerants = new ArrayList<Gerant>();
	
	public Ferme() {
	}

	public Ferme(String nom, Date dateAchat) {
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	public Ferme(String nom, Date dateAchat, List<Gerant> gerants) {
		this.nom = nom;
		this.dateAchat = dateAchat;
		this.gerants = gerants;
	}

	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public List<Gerant> getGerants() {
		return gerants;
	}

	public void setGerants(List<Gerant> gerants) {
		this.gerants = gerants;
	}

	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}
	
}
