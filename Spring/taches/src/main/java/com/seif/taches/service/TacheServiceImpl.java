package com.seif.taches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seif.taches.entities.Projet;
import com.seif.taches.entities.Tache;
import com.seif.taches.repos.ImageRepository;
import com.seif.taches.repos.TacheRepository;

@Service
public class TacheServiceImpl implements TacheService{
	
	@Autowired
	TacheRepository tacheRepository;
	
	@Autowired
	ImageRepository imageRepository;

	@Override
	public Tache saveTache(Tache t) {
		return tacheRepository.save(t);
	}
	/*
	@Override
	public Tache updateTache(Tache t) {
		return tacheRepository.save(t);
	}*/
	
	@Override
	public Tache updateTache(Tache t) {
		//Long oldTacheImageId =
		//		this.getTache(t.getIdTache()).getImage().getIdImage();
		//Long newTacheImageId = t.getImage().getIdImage();
		Tache tacheUpdated = tacheRepository.save(t);
		//if (oldTacheImageId != newTacheImageId) //si l'image a été modifiée
		//	imageRepository.deleteById(oldTacheImageId);
		return tacheUpdated;
	}

	@Override
	public void deleteTache(Tache p) {
		tacheRepository.delete(p);
	}

	@Override
	public void deleteTacheById(Long id) {
		Tache t = getTache(id);
		//delete all pics in the database for this tache
		imageRepository.deleteByTache(t);

		
		 //suuprimer l'image avant de supprimer le tache
		/*try {
			Files.delete(Paths.get(System.getProperty("user.home")+"/OneDrive/images/"+t.getImagePath()));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		tacheRepository.deleteById(id);
	}

	@Override
	public Tache getTache(Long id) {
		return tacheRepository.findById(id).get();
	}

	@Override
	public List<Tache> getAllTaches() {	
		return tacheRepository.findAll();
	}

	@Override
	public List<Tache> findByNomTache(String nom) {
		return tacheRepository.findByNomTache(nom);
	}

	@Override
	public List<Tache> findByNomTacheContains(String nom) {
		return tacheRepository.findByNomTacheContains(nom);
	}

	@Override
	public List<Tache> findByNomStatut(String nom, String statut) {
		return tacheRepository.findByNomStatut(nom, statut);
	}

	@Override
	public List<Tache> findByProjet(Projet projet) {
		return tacheRepository.findByProjet(projet);
	}

	@Override
	public List<Tache> findByProjetIdProjet(Long id) {
		return tacheRepository.findByProjetIdProjet(id);
	}

	@Override
	public List<Tache> findByOrderByNomTacheAsc() {
		return tacheRepository.findByOrderByNomTacheAsc();
	}

	@Override
	public List<Tache> trierTachesDateCreationNom() {
		return tacheRepository.trierTachesDateCreationNom();
	}

}
