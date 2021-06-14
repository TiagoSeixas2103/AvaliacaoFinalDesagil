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
	void testZeroSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 5);
		assertEquals("0:05", track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 60);
		assertEquals("1:00", track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 65);
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 85);
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 120);
		assertEquals("2:00", track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 125);
		assertEquals("2:05", track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Artist artist = new Artist("Ana");
		Track track = new Track(artist, "faixa", 145);
		assertEquals("2:25", track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "faixa", 0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testTwoCollaborators() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "faixa", 0);
		assertEquals("0:00", track.getDurationString());
	}
}