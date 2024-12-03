package com.seif.taches.service;

import java.util.List;

import com.seif.taches.entities.Projet;
import com.seif.taches.entities.Tache;

public interface TacheService {
	
	Tache saveTache(Tache t);
	Tache getTache(Long id);
	List<Tache> getAllTaches();
	
	Tache updateTache(Tache t);
	void deleteTache(Tache p);
	void deleteTacheById(Long id);
	
	List<Tache> findByNomTache(String nom);
	List<Tache> findByNomTacheContains(String nom);
	List<Tache> findByNomStatut(String nom, String statut);
	List<Tache> findByProjet (Projet projet);
	List<Tache> findByProjetIdProjet(Long id);
	List<Tache> findByOrderByNomTacheAsc();
	List<Tache> trierTachesDateCreationNom();

	
}