import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class PersonalManagementTest {
    @Test
    void displayData() throws SQLException {
        PersonalManagement m = new PersonalManagement();


        m.addPerson(1, "Teodora", "Dzinic", Gender.FEMALE, "14.08.1997", "4040",
                "Linz", "strasse", 2);
        m.addPerson(7, "Teo", "Dzinic", Gender.FEMALE, "14.08.1997", "4040",
                "Linz", "strasse", 2);
        m.addPerson( 2, "Zlatko", "Dzinic", Gender.MALE, "14.07.1996");
        m.addPerson(3, "Zlatko", "Dzinic");
        m.addPerson( 4, "Renan", "Hanada");
        m.remove(4);

        m.displayData();
    }


}