package com.cybertek.dbUtilities;

import java.sql.*;
public class JDBC {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    public static void createConnection(String URL, String username, String password){
        try {
            connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connection to DB has been established");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Fuck you");
        }
    }
    public static ResultSet executeQuery(String query){
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }
    public static void close(){
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}