package com.seif.taches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.seif.taches.entities.Projet;
import com.seif.taches.entities.Tache;

@SpringBootApplication
@EnableDiscoveryClient
public class TachesApplication implements CommandLineRunner{
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(TachesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Tache.class, Projet.class);
	}
	
	/*@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}*/
}
