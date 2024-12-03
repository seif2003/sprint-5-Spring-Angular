package com.seif.taches.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import com.seif.taches.entities.Image;

public interface ImageService {
	Image uplaodImage(MultipartFile file) throws IOException;
	Image getImageDetails(Long id) throws IOException;
	ResponseEntity<byte[]> getImage(Long id) throws IOException;
	void deleteImage(Long id) ;
	
	Image uplaodImageTache(MultipartFile file,Long idTache) throws IOException;
	List<Image> getImagesParTache(Long tacheId);
}