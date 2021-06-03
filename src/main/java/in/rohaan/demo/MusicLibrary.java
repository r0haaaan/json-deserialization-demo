package in.rohaan.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MusicLibrary {
    @JsonProperty("libraryname")
    private String libraryName;

    @JsonProperty("mymusic")
    private List<Song> mymusic;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public List<Song> getMymusic() {
        return mymusic;
    }

    public void setMymusic(List<Song> mymusic) {
        this.mymusic = mymusic;
    }
}
