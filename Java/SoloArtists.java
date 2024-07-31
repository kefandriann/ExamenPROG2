package ExamenPROG2.ExamenPROG2.Java;

import java.time.LocalDate;
import java.time.Year;

public class SoloArtists extends Artist {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public SoloArtists(String nationality, String name, Year beginningYear, String artistId, LocalDate birthDate, String firstName, String lastName) {
        super(nationality, name, beginningYear, artistId);
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
