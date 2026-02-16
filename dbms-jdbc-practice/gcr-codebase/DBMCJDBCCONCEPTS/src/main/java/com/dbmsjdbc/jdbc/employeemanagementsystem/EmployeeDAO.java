package com.dbmsjdbc.jdbc.employeemanagementsystem;

import java.sql.*;
import java.util.*;

public class EmployeeDAO {

    // INSERT
    public void addEmployee(Employee emp) {

        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDepartment());
            ps.setDouble(3, emp.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT ALL 
    public List<Employee> getAllEmployees() {

        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employees";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getTimestamp("created_at").toLocalDateTime()
                );
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
