package com.seif.taches.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seif.taches.entities.Tache;
import com.seif.taches.service.TacheService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TacheRESTController {
	
	@Autowired
	TacheService tacheService;
	
	@GetMapping("/all")
	List<Tache> getAllTaches() {
		return tacheService.getAllTaches();
	}
	
	@GetMapping("/getbyid/{id}")
	public Tache getTacheById(@PathVariable Long id) {
		return tacheService.getTache(id);
	}
	
	@PostMapping("/addtache")
	@PreAuthorize("hasAuthority('ADMIN')")
	public Tache createTache(@RequestBody Tache tache) {
		return tacheService.saveTache(tache);
	}
	
	@PutMapping("/updatetache")
	public Tache updateTache(@RequestBody Tache tache) {
		return tacheService.updateTache(tache);
	}
	
	@DeleteMapping("/deltache/{id}")
	public void deleteTache(@PathVariable Long id) {
		tacheService.deleteTacheById(id);
	}
	
	@GetMapping("/tachesprojet/{idProj}")
	public List<Tache> getTacheByProjId(@PathVariable Long idProj){
		return tacheService.findByProjetIdProjet(idProj);
	}
	
	@GetMapping("/tachesByName/{nom}")
	public List<Tache> findByNomTacheContains(@PathVariable("nom") String nom){
		return tacheService.findByNomTacheContains(nom);
	}
	
	
}
