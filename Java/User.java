package ExamenPROG2.ExamenPROG2.Java;

import java.util.List;

public class User {
    private String userName;
    private String email;
    private List<Playlist> playlists;
    private List<Playlist> likedPlaylists;

    public User(String email, String userName) {
        this.email = email;
        this.userName = userName;
        this.playlists = null;
    }

    public void addToPlaylist(Playlist playlist){
        this.playlists.add(playlist);
    }

    public void like(Playlist playlist){
        if (!likedPlaylists.contains(playlist)){
            likedPlaylists.add(playlist);
            playlist.addLike();
        } else {
            likedPlaylists.remove(playlist);
            playlist.removeLike();
        }
    }

    public int countPlaylist(Song song){
        int counter = 0;
        for (Playlist p : playlists){
            for (Song s : p.getSongs()) {
                if (s.equals(song)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
