package connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connetion
 */
public class Connetion {

    private static final String url = "jdbc:mysql://localhost:3306/exemplobd";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection conn;

    public static Connection getConnection() {

        try {
            if (conn == null) {

                return conn = DriverManager.getConnection(url, user, password);

            } else {
                return conn;
            }
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }

    }
}