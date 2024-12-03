package com.seif.taches;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.seif.taches.entities.Projet;
import com.seif.taches.entities.Tache;
import com.seif.taches.repos.TacheRepository;

@SpringBootTest
class TachesApplicationTests {

	// @Autowired
	// private TacheRepository tacheRepository;
	
	// @Test
	// public void testCreateTache() {
	// 	Tache tache = new Tache("Develop Feature X", "Complete development of the new feature X", "En cours", new Date(), new Date());
	// 	tacheRepository.save(tache);
	// }
	
	// @Test
	// public void testFindTache()
	// {
	// 	Tache p = tacheRepository.findById(1L).get();
	// 	System.out.println(p);
	// }
	
	// @Test
	// public void testUpdateTache()
	// {
	// 	Tache p = tacheRepository.findById(1L).get();
	// 	p.setStatut("Terminé");
	// 	tacheRepository.save(p);
	// }
	
	// @Test
	// public void testDeleteTache()
	// {
	// 	tacheRepository.deleteById(1L);;
	// }
	
	// @Test
	// public void testListerTousTaches()
	// {
	// 	List<Tache> taches = tacheRepository.findAll();
	// 	for (Tache t : taches)
	// 	{
	// 		System.out.println(t);
	// 	}
	// }

	// @Test
	// public void testFindTacheByNom()
	// {
	// 	List<Tache> t = tacheRepository.findByNomTache("Develop Feature X");
	// 	System.out.println(t);
	// }

	// @Test
	// public void testFindTacheByNomContains()
	// {
	// 	List<Tache> t = tacheRepository.findByNomTacheContains("Develop");
	// 	System.out.println(t);
	// }
	
	// @Test
	// public void testFindTacheByNomStatus()
	// {
	// 	List<Tache> t = tacheRepository.findByNomStatut("Feature","En cours");
	// 	System.out.println(t);
	// }
	
	// @Test
	// public void testfindByCategorie()
	// {
	// 	Projet pro = new Projet();
	// 	pro.setIdProjet(1L);
	// 	List<Tache> taches = tacheRepository.findByProjet(pro);
	// 	for (Tache t : taches)
	// 	{
	// 		System.out.println(t);
	// 	}
	// }
	
	// @Test
	// public void findByProjetIdProjet()
	// {
	// 	List<Tache> taches = tacheRepository.findByProjetIdProjet(1L);
	// 	for (Tache t : taches)
	// 	{
	// 		System.out.println(t);
	// 	}
	// }
	
	// @Test
	// public void testfindByOrderByNomTacheAsc()
	// {
	// 	List<Tache> taches = tacheRepository.findByOrderByNomTacheAsc();
	// 	for (Tache t : taches)
	// 	{
	// 		System.out.println(t);
	// 	}
	// }
	
	// @Test
	// public void testTrierTachesDateCreationNom()
	// {
	// 	List<Tache> taches = tacheRepository.trierTachesDateCreationNom();
	// 	for (Tache t:taches)
	// 	{
	// 		System.out.println(t);
	// 	}
	// }

	
}
