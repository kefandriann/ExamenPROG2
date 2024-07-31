package ExamenPROG2.ExamenPROG2.Java;

import java.util.List;

public class Playlist {
    private List<Song> songs;
    private int likes;

    public Playlist() {
        this.likes = 0;
        this.songs = null;
    }

    public String removeById (String songId) {
        for (Song e : songs){
            if (e.getSongId() == songId) {
                songs.remove(e);
                return "Song removed successfully.";
            }
        }
        return "Song not found.";
    }

    public int getTotalLikes() {
        return likes;
    }

    public void addLike() {
        this.likes++;
    }

    public void removeLike() {
        this.likes--;
    }

    public List<Song> exclude (Genre a) {
        List<Song> filteredPlaylist = null;
        for (Song e : songs){
            if (!e.getGenres().contains(a)){
                filteredPlaylist.add(e);
            }
        }
        return filteredPlaylist;
    }

    public List<Song> exclude (Genre a, Genre b) {
        List<Song> filteredPlaylist = null;
        for (Song e : songs){
            if (!e.getGenres().contains(a) && !e.getGenres().contains(b)){
                filteredPlaylist.add(e);
            }
        }
        return filteredPlaylist;
    }

    public List<Song> exclude (Genre a, Genre b, Genre c) {
        List<Song> filteredPlaylist = null;
        for (Song e : songs){
            if (!e.getGenres().contains(a) && !e.getGenres().contains(b) && !e.getGenres().contains(c)){
                filteredPlaylist.add(e);
            }
        }
        return filteredPlaylist;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
