package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	@BeforeEach
	void setUp() {
	}
	

	@Test
	void avaliacoes1233() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario3", 2.5);
		playlist.putRating("usuario3", 2.5);
		playlist.averageRatings();
		assertEquals(2, playlist.averageRatings());
	}

	@Test
	void avaliacoes121() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario1", 1.5);
		playlist.averageRatings();
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void avaliacoes122() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.averageRatings();
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void avaliacoes1123() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario3", 3.5);
		playlist.averageRatings();
		assertEquals(2, playlist.averageRatings());
	}
}


	