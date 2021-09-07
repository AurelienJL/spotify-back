package fr.ajl.spotifyback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ajl.spotifyback.model.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
