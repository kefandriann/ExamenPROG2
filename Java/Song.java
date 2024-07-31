package ExamenPROG2.ExamenPROG2.Java;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Song {
    private String songId;
    private String title;
    private Duration duration;
    private List<Genre> genres;
    private Artist artist;
    private Album album;

    public Song(Album album, Artist artist, Duration duration, List<Genre> genres, String songId, String title) {
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.genres = genres;
        this.songId = songId;
        this.title = title;
    }

    public String getSongId() {
        return songId;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songId, song.songId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(songId);
    }
}
