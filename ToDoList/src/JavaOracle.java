import java.sql.*;

public class JavaOracle {
    public static void main(String[] args) {

        try {
           SQLconnection();

        } catch (SQLException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
    }


    public static void SQLconnection() throws SQLException {

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

        String sql = "SELECT * FROM todo";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while(result.next()){
            String tasks = result.getString(2);
            String name = result.getString(3);
            System.out.print(tasks + " - ");
            System.out.println(name);
        }
        connection.close();
    }
}
