package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Playlist {
	public Integer id;
	public ArrayList<Track> tracks;
	public HashMap<String, Double> ratings;
	
	public Playlist(Integer id) {
		super();
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
		
	
	}

	public Integer getId() {
		return id;
	}

	public ArrayList<Track> getTracks() {
		return tracks;
	}

	public HashMap<String, Double> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String nome, double avaliacao) {
		this.ratings.put(nome, avaliacao);
	}

	public double averageRatings() {
		double avaliacoes = 0;
		Integer contador = 0;
		for (double avaliacao: this.ratings.values()) {
			avaliacoes += avaliacao;
			contador += 1;
		}
		
		double mediaAvaliacoes = (double) avaliacoes/contador;
		Integer mediaAvaliacoesInteger = (int)mediaAvaliacoes;
		double mediaAvaliacoesDouble = mediaAvaliacoes - mediaAvaliacoesInteger;
		if (mediaAvaliacoesDouble < 0.25) {
			mediaAvaliacoesDouble = 0;
		}
		else if (0.75 > mediaAvaliacoesDouble && mediaAvaliacoesDouble >= 0.25) {
			mediaAvaliacoesDouble = 0.5;
		} else if (mediaAvaliacoesDouble >= 0.75) {
			mediaAvaliacoesDouble = 0.0;
			mediaAvaliacoesInteger += 1;
		}
		double mediaAvaliacoesFinal = mediaAvaliacoesInteger + mediaAvaliacoesDouble;
		
		return mediaAvaliacoesFinal;
	}

	
}
