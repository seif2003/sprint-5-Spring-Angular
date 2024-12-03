package com.seif.taches.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seif.taches.entities.Projet;
import com.seif.taches.repos.ProjetRepository;

@RestController
@RequestMapping("/api/proj")
@CrossOrigin
public class ProjetRESTController {
	
	@Autowired
	ProjetRepository projetRepository;
	
	@GetMapping
	public List<Projet> getAllProjets(){
		return projetRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Projet getProjetById(@PathVariable Long id) {
		return projetRepository.findById(id).get();
	}
	
}
