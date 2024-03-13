package org.performance;

import java.sql.*;

public class MySQLJDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/book_shop";
        String userName = "root";
        String password = "########"; // replace the password here !!! Not for production :P

        // get the data
        try (Connection connection = DriverManager.getConnection(url, userName, password)){
            Statement statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM book_shop.books";
            ResultSet rs = statement.executeQuery(sqlQuery);

            while(rs.next()) {
                int bookID = rs.getInt("book_id");
                String title = rs.getString("title");
                String authorFName = rs.getString("author_fname");

                System.out.println("ID: " + bookID + " Title: " + title + " Author: " + authorFName);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
