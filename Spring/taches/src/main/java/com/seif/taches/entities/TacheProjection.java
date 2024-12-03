package com.seif.taches.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomTache", types = { Tache.class })
public interface TacheProjection {
	public String getNomTache();
}
