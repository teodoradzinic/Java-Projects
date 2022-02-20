import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        PersonalManagement m = new PersonalManagement();

        try {
            PersonalManagement.SQLconnection();
            System.out.println("Connected to Oracle database server");

        } catch (SQLException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }


        //date format yyyy-mm-dd
        m.addPerson(6000, "Andi", "L", Gender.MALE, "1996-10-16", "4600",
                "Wels", "Street Name", 60);
        m.addPerson(4, "Alex", "Alexx");


       /*  m.addPerson(14, "Vladimir", "A", Gender.MALE, "2000-5-13", "5000", "Belgrad",
                "Ulica", 25);

        m.addPerson(200, "Gordana", "R", Gender.FEMALE, "1997-8-14", "4040",
              "Linz", "strasse", 2);
        m.addPerson(4, "Renan", "Hanada");
        m.addPerson(75594, "Maria", "Tonic", Gender.FEMALE, "14.08.1997");*/

        m.displayData();

    }


   /*public static void SQLconnection() throws SQLException {

        String dbURL = "jdbc:oracle:thin:@dbexpress.westeurope.cloudapp.azure.com:1521:xe";
        String username = "tdzinic";
        String password = "passme";

        Connection connection = DriverManager.getConnection(dbURL, username, password);
        System.out.println("Connected to Oracle database server");


        /*String sql = "INSERT INTO todo(todo_id, tasks, username) VALUES(?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, 2);
            statement.setString(2, "buy milk");
            statement.setString(3, "Teodora");

            int rows = statement.executeUpdate();
            if(rows > 0){
                System.out.println("A row has been inserted");
            }*/

      /*  String sql = "SELECT * FROM todo";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while(result.next()){
            String tasks = result.getString(2);
            String name = result.getString(3);
            System.out.print(tasks + " - ");
            System.out.println(name);
        }
        connection.close();
    }*/
}
