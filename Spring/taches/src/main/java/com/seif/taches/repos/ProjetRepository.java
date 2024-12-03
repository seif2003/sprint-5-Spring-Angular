package com.seif.taches.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.seif.taches.entities.Projet;

@RepositoryRestResource(path = "projet")
@CrossOrigin("*")
public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
