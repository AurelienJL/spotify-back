package fr.ajl.spotifyback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(nullable = false, updatable = false)
	private String spotifyId;
	private boolean liked;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSpotifyId() {
		return spotifyId;
	}
	public void setSpotifyId(String spotifyId) {
		this.spotifyId = spotifyId;
	}
	public boolean isLiked() {
		return liked;
	}
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	
	

}
