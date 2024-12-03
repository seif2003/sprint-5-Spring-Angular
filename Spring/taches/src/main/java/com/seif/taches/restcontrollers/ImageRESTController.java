package com.seif.taches.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.seif.taches.entities.Image;
import com.seif.taches.entities.Tache;
import com.seif.taches.service.ImageService;
import com.seif.taches.service.TacheService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/api/image")
@CrossOrigin(origins = "*")
public class ImageRESTController {
	@Autowired
	ImageService imageService ;
	
	@Autowired
	TacheService tacheService;


	@RequestMapping(value = "/upload" , method = RequestMethod.POST)
	public Image uploadImage(@RequestParam("image")MultipartFile file) throws IOException {
		return imageService.uplaodImage(file);
	}
	@RequestMapping(value = "/get/info/{id}" , method = RequestMethod.GET)
	public Image getImageDetails(@PathVariable("id") Long id) throws IOException {
		return imageService.getImageDetails(id) ;
	}
	@RequestMapping(value = "/load/{id}" , method = RequestMethod.GET)
	public ResponseEntity<byte[]> getImage(@PathVariable("id") Long id) throws IOException
	{
		return imageService.getImage(id);
	}


	@RequestMapping(value = "/delete/{id}" , method = RequestMethod.DELETE)
	public void deleteImage(@PathVariable("id") Long id){
		imageService.deleteImage(id);
	}
	@RequestMapping(value="/update",method = RequestMethod.PUT)
	public Image UpdateImage(@RequestParam("image")MultipartFile file) throws IOException {
		return imageService.uplaodImage(file);
	}
	
	@PostMapping(value = "/uplaodImageTache/{idTache}" )
	public Image uploadMultiImages(@RequestParam("image") MultipartFile file,@PathVariable("idTache") Long idTache) throws IOException {
		return imageService.uplaodImageTache(file,idTache);
	}
	@RequestMapping(value = "/getImagesTache/{idTache}" , method = RequestMethod.GET)
	public List<Image> getImagesProd(@PathVariable("idTache") Long idTache) throws IOException {
		return imageService.getImagesParTache(idTache);
	}

	@RequestMapping(value = "/uploadFS/{id}" , method = RequestMethod.POST)
	public void uploadImageFS(@RequestParam("image") MultipartFile file,@PathVariable("id") Long id) throws IOException {
		Tache t = tacheService.getTache(id);
		t.setImagePath(id+".jpg");

		Files.write(Paths.get(System.getProperty("user.home")+"/OneDrive/Images/"+t.getImagePath())
				, file.getBytes());
		tacheService.saveTache(t);

	}
	@RequestMapping(value = "/loadfromFS/{id}" ,method = RequestMethod.GET,produces = org.springframework.http.MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImageFS(@PathVariable("id") Long id) throws IOException {
		Tache t = tacheService.getTache(id);
		return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/OneDrive/images/"+t.getImagePath()));
	}



}
