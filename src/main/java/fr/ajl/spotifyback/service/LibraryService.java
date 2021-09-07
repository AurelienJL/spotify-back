package fr.ajl.spotifyback.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ajl.spotifyback.model.Album;
import fr.ajl.spotifyback.model.Library;
import fr.ajl.spotifyback.repository.LibraryRepository;

@Service
public class LibraryService {

	private final LibraryRepository libraryRepository;

	@Autowired
	public LibraryService(LibraryRepository libraryRepository) {
		this.libraryRepository = libraryRepository;
	}
	
	public List<Library> findAllLibraries() {
		return libraryRepository.findAll();
	}
	
	public Library createLibrary() {
		Library library = new Library();
		library.setAlbums(Collections.emptySet());
		return libraryRepository.save(library);
	}
	
	public Library updateLibrary(Album album) {
		// pour le moment, gestion d'un seule bibliothèque d'albums
		Library library = findAllLibraries().get(0);
		if (library != null) {
			library = createLibrary();
		}
		library.getAlbums().add(album);
		
		return libraryRepository.save(library);
		
	}
	
	
}
