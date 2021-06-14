package br.edu.insper.desagil.backend.model;

public class Track {
	public Artist artist;
	public String name;
	public Integer duration;
	
	public Track(Artist artist, String name, Integer duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
	public Artist getArtist() {
		return artist;
	}
	
	public String getName() {
		return name;
	}

	public Integer getDuration() {
		return duration;
	}
	
	public String getDurationString( ) {
		String durationFim = "";
		Integer durationMin = (Integer) this.duration/60;
		Integer durationSeg = (Integer) this.duration - durationMin*60;
		if (durationSeg < 10) {
			durationFim = durationMin + ":0" + durationSeg;
		} else {
			durationFim = durationMin + ":" + durationSeg;
		}
		
		return durationFim;	
		
	}
	
	public String getFullArtistName( ) {
		String nomeCompleto = this.artist.getName();
		return nomeCompleto;
	}
	
	

}
