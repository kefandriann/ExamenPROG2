package ExamenPROG2.ExamenPROG2.Java;

import java.time.LocalDate;
import java.time.Year;

public abstract class Artist {
    private String artistId;
    private String name;
    private Year beginningYear;
    private String nationality;

    public Artist(String nationality, String name, Year beginningYear, String artistId) {
        this.nationality = nationality;
        this.name = name;
        this.beginningYear = beginningYear;
        this.artistId = artistId;
    }
}
