package ExamenPROG2.ExamenPROG2.Java;

import java.time.LocalDate;
import java.util.List;

public class Album {
    private String albumId;
    private LocalDate releaseDate;
    private Artist artist;
    private List<Song> songs;

    public Album(String albumId, Artist artist, LocalDate releaseDate) {
        this.albumId = albumId;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.songs = null;
    }
}
