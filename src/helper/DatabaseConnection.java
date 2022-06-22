package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;

    static {

        String jdbcUrl = "jdbc:mysql://localhost:3306/java_database";
        String user = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException exception) {
            System.err.println(exception);
        }
    }

    public static Connection getConnection() {
        return connection;
    }

}
