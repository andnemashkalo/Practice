package Practice_JDBC;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost/rapture","anemashkalo","jokerwayne");
        Statement statement= con.createStatement();
       ResultSet resultSet= statement.executeQuery("select * from s");
        ArrayList<Employee> employees=new ArrayList<>();
        while (resultSet.next()){
            employees.add(new Employee(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getDouble(5)));
        }
        System.out.println("EMPLOYEES");
        employees.forEach(System.out::println);

        Statement statement2= con.createStatement();
       ResultSet resultSet2=statement2.executeQuery("select * from c");
       ArrayList<Customer> customer=new ArrayList<>();
        System.out.println("\nCLIENTS: ");
       while (resultSet2.next()){
           customer.add(new Customer(resultSet2.getInt(1),
                   resultSet2.getString(2),
                   resultSet2.getString(3),
                   resultSet2.getInt(4),
                   resultSet2.getInt(5)));
       }
       customer.forEach(System.out::println);
    }
}
