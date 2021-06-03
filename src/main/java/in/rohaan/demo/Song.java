package in.rohaan.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Song {
    @JsonProperty("Artist Name")
    private String artistName;

    @JsonProperty("Song Name")
    private String songName;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

}
