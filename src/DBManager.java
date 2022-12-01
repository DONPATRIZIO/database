import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import java.sql.Statement;

public class DBManager {
    private static Connection connection = null;

    public static Connection connectionToDb() {
        
        String databaseDriver = "com.mysql.cj.jdbc.Driver";
        String databaseURLConnection = "jdbc:mysql://localhost:3306/DBtest";
        String dbUser = "root";
        String dbPassword = "root";

        try {
            Class.forName(databaseDriver);
            System.out.println("Driver caricato correttamente. ");

            connection = DriverManager.getConnection(databaseURLConnection, dbUser, dbPassword);
            System.out.println("Connessione al DB stabilita.");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return connection;
    }

    public static void createTable( String tableName) {
        Statement statement;
        String creationTableQuery = "CREATE TABLE TEST(id serial,name VARCHAR (200))";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(creationTableQuery);
            System.out.println("tabella creata");
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public static void insertRecord() {
        String insertQuery = "INSERT INTO TEST(`name`)VALUES(\"test\")"; // escaping caratteri

        try {
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            int recordInserted = insertStatement.executeUpdate();
            System.out.println(recordInserted);
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
