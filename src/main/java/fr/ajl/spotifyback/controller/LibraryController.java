package fr.ajl.spotifyback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ajl.spotifyback.model.Album;
import fr.ajl.spotifyback.model.Library;
import fr.ajl.spotifyback.service.LibraryService;

@RestController
@CrossOrigin(origins = "http://localhost/4200")
@RequestMapping("/library")
public class LibraryController {
	
	private final LibraryService libraryService;

	public LibraryController(LibraryService libraryService) {
		this.libraryService = libraryService;
	}
	
	@PutMapping("/update")
	public ResponseEntity<Library> updateLibrary(@RequestBody Album album) {
		Library library = libraryService.updateLibrary(album);
		return new ResponseEntity<>(library, HttpStatus.CREATED);
	}

}