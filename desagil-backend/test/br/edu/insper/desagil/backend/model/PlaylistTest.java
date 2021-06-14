package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;

	@BeforeEach
	void setUp() {
	}

	@Test
	void testRoundDownToZero() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario3", 2.5);
		playlist.putRating("usuario3", 2.5);
		playlist.averageRatings();
		assertEquals(2, playlist.averageRatings());
	}

	@Test
	void testRoundUpToHalf() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario1", 1.5);
		playlist.averageRatings();
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void testRoundDownToHalf() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.averageRatings();
		assertEquals(1.5, playlist.averageRatings());
	}

	@Test
	void testRoundUpToOne() {
		Playlist playlist = new Playlist(5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario1", 1.5);
		playlist.putRating("usuario2", 1.5);
		playlist.putRating("usuario3", 3.5);
		playlist.averageRatings();
		assertEquals(2, playlist.averageRatings());
	}
}
