/*Java Database Connectivity (JDBC):
Create a database of employee with the following fields.
• Name
• Code
• Designation
• Salary
a) Write a java program to create GUI java application to take
employee data from the TextFields and store it in database
using JDBC connectivity.
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeDatabaseApp extends JFrame implements ActionListener {
    private JLabel nameLabel, codeLabel, designationLabel, salaryLabel;
    private JTextField nameField, codeField, designationField, salaryField;
    private JButton saveButton, resetButton, exitButton;

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employeedb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_sql_password";

    public EmployeeDatabaseApp() {
        setTitle("Employee Data Entry");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        nameLabel = new JLabel("Name:");
        codeLabel = new JLabel("Code:");
        designationLabel = new JLabel("Designation:");
        salaryLabel = new JLabel("Salary:");

        nameField = new JTextField(20);
        codeField = new JTextField(10);
        designationField = new JTextField(20);
        salaryField = new JTextField(10);

        saveButton = new JButton("Save");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

        // Add action listeners to buttons
        saveButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(saveButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);

        // Set layout
        setLayout(new GridLayout(6, 2));

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(codeLabel);
        add(codeField);
        add(designationLabel);
        add(designationField);
        add(salaryLabel);
        add(salaryField);
        add(new JLabel()); // Placeholder for empty cell
        add(buttonPanel); // Add button panel

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            saveEmployeeData();
        } else if (e.getSource() == resetButton) {
            resetFields();
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private void saveEmployeeData() {
        String name = nameField.getText();
        int code = Integer.parseInt(codeField.getText());
        String designation = designationField.getText();
        double salary = Double.parseDouble(salaryField.getText());

        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root","your_sql_password");

            // Create a prepared statement
            String query = "INSERT INTO employee (NAME, CODE, DESIGNATION, SALARY) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, code);
            statement.setString(3, designation);
            statement.setDouble(4, salary);

            // Execute the statement
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Employee data saved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to save employee data.");
            }

            // Close resources
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void resetFields() {
        nameField.setText("");
        codeField.setText("");
        designationField.setText("");
        salaryField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeDatabaseApp());
    }
}
