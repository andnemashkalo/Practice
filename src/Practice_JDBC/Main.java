package Practice_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost/mysql","anemashkalo","jokerwayne");
        System.out.println("Groovy! COnnected!");
        con.close();
    }
}
