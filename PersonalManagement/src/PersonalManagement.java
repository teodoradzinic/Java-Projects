import java.sql.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class PersonalManagement {

    private List<Person> people;

    PersonalManagement() {
        people = new ArrayList<Person>();
    }

    public void addPerson(int id, String firstName, String lastName, Gender gender,
                          String dateOfBirth, String postalCode, String city, String streetName, int houseNumber) throws SQLException {
        if (checkId(id)) {
            Address address = new Address(postalCode, city, streetName, houseNumber);
            people.add(new Person(id, firstName, lastName, gender, dateOfBirth, address));
            addToDB(id, firstName, lastName, gender, address.addressToString(), dateOfBirth, SQLconnection());
        } else {
            System.out.println("Id already in use! Change id");
        }
    }

    public void addPerson(int id, String firstName, String lastName, Gender
            gender, String dateOfBirth) throws SQLException {
        if (checkId(id)) {
            people.add(new Person(id, firstName, lastName, gender, dateOfBirth));
            addToDB(id, firstName, lastName, gender, dateOfBirth, SQLconnection());
        } else {
            System.out.println("Id already in use! Change id");
        }
    }

    public void addPerson(int id, String firstName, String lastName) throws SQLException {
        if (checkId(id)) {
            people.add(new Person(id, firstName, lastName));
            addToDB(id, firstName, lastName, SQLconnection());
        } else {
            System.out.println("Id already in use! Change id");
        }
    }

    public static Connection SQLconnection() throws SQLException {

        String dbURL = "jdbc:oracle:thin:@dbexpress.westeurope.cloudapp.azure.com:1521:xe";
        String username = "tdzinic";
        String password = "passme";

        return DriverManager.getConnection(dbURL, username, password);

    }

    public void addToDB(int id, String firstName, String lastName, Gender gender, String address, String dateOfBirth, Connection connection)
            throws SQLException {
        String sql = "INSERT INTO people(id, first_name, last_name, gender, address, date_of_birth ) VALUES(?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.setString(4, String.valueOf(gender));
        statement.setString(5, address);
        statement.setDate(6, Date.valueOf(dateOfBirth));


        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("A row has been inserted");
        }
        connection.close();
    }

    public void addToDB(int id, String firstName, String lastName, Gender gender, String dateOfBirth, Connection connection)
            throws SQLException {
        String sql = "INSERT INTO people(id, first_name, last_name, gender, date_of_birth) VALUES(?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, firstName);
        statement.setString(3, lastName);
        statement.setString(4, String.valueOf(gender));
        statement.setDate(5, Date.valueOf(dateOfBirth));

        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("A row has been inserted");
        }
        connection.close();
    }

    public void addToDB(int id, String firstName, String lastName, Connection connection) throws SQLException {
        String sql = "INSERT INTO people(id, first_name, last_name) VALUES(?,?,?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, firstName);
        statement.setString(3, lastName);

        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("A row has been inserted");
        }
        connection.close();
    }


    public void remove(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                people.remove(people.get(i));
            }
        }
    }

    public boolean checkId(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id)
                return false;
        }
        return true;
    }

    public void displayData() {
        for (int i = 0; i < people.size(); i++) {
            people.get(i).printPersonData();
            System.out.println();
        }
    }
}
