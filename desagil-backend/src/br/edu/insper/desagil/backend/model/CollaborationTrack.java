package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	public List<Artist> colaboradores;

	public CollaborationTrack(Artist artist, List<Artist> colaboradores, String name, Integer duration) {
		super(artist, name, duration);
		this.colaboradores = colaboradores;
	}
	
	@Override
	public String getFullArtistName() {
		List<String> listaDeStrings = new ArrayList<>();
		for (Artist artist : this.colaboradores) {
			listaDeStrings.add(artist.getName());
		}
		String nomeCompleto = this.getArtist().getName() + "( feat. " + String.join(",", listaDeStrings) + ")";
		return nomeCompleto;
	}

}
