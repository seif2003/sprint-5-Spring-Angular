package com.seif.taches.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Tache {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTache;
	
	private String nomTache;

    private String description;

    private String statut;

    private Date dateEcheance;
    
    private Date dateCreation;
    
    @ManyToOne
    private Projet projet;
    
    /*@OneToOne
    private Image image;*/
    
    @OneToMany (mappedBy = "tache")
    private List<Image> images;
    
    private String imagePath;


	public Tache() {
		super();
	}

	public Tache(String nomTache, String description, String statut, Date dateEcheance, Date dateCreation) {
		super();
		this.nomTache = nomTache;
		this.description = description;
		this.statut = statut;
		this.dateEcheance = dateEcheance;
		this.dateCreation = dateCreation;
	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public String getNomTache() {
		return nomTache;
	}

	public void setNomTache(String nomTache) {
		this.nomTache = nomTache;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", nomTache=" + nomTache + ", description=" + description + ", statut="
				+ statut + ", dateEcheance=" + dateEcheance + ", dateCreation=" + dateCreation + "]";
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	

	
}
