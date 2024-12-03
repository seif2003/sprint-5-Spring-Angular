package com.seif.taches.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.seif.taches.entities.Image;
import com.seif.taches.entities.Tache;

public interface ImageRepository extends JpaRepository<Image, Long>{

    // void deleteByTache(Tache t);

    @Modifying
    @Transactional
    @Query("DELETE FROM Image i WHERE i.tache = :tache")
    void deleteByTache(@Param("tache") Tache t);

}
