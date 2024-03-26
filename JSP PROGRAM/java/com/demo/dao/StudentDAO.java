package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.model.Student;

public class StudentDAO {

    private static final String INSERT_USERS_SQL = "INSERT INTO student" +
        " (id, first_name, last_name, address, contact) VALUES " +
        " (?, ?, ?, ?, ?);";

    public int registerStudent(Student student) throws ClassNotFoundException, SQLException {
        int result = 0;

        // Step 1: Load JDBC Driver
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentServletTable?useSSL=false", "root", "Saikrishna@107");
            // Step 2: Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {

            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getContact());

            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());

                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
