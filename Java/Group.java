package ExamenPROG2.ExamenPROG2.Java;

import java.time.Year;
import java.util.List;

public class Group extends Artist {
    private List<SoloArtists> soloArtists;

    public Group(String nationality, String name, Year beginningYear, String artistId, List<SoloArtists> soloArtists) {
        super(nationality, name, beginningYear, artistId);
        this.soloArtists = soloArtists;
    }
}
