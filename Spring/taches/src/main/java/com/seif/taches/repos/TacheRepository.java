package com.seif.taches.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.seif.taches.entities.Projet;
import com.seif.taches.entities.Tache;

@RepositoryRestResource(path = "rest")
public interface TacheRepository extends JpaRepository<Tache, Long> {
	
	List<Tache> findByNomTache(String nom);
	List<Tache> findByNomTacheContains(String nom);
	
	@Query("select t from Tache t where t.nomTache like concat('%', :nom, '%') and t.statut = :statut")
	List<Tache> findByNomStatut(@Param("nom") String nom, @Param("statut") String statut);

	@Query("select t from Tache t where t.projet = ?1")
	List<Tache> findByProjet(Projet projet);
	
	List<Tache> findByProjetIdProjet(Long id);
	
	List<Tache> findByOrderByNomTacheAsc();
	
	@Query("select t from Tache t order by t.dateCreation ASC, t.nomTache ASC")
	List<Tache> trierTachesDateCreationNom();
}
