import java.sql.*;

public class RetrieveEmployees {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "your_sql_password");
            System.out.println("connected");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String code = resultSet.getString("code");
                String designation = resultSet.getString("designation");
                double salary = resultSet.getDouble("salary");
                System.out.println("Name: " + name + ", Code: " + code + ", Designation: " + designation + ", Salary: " + salary);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}