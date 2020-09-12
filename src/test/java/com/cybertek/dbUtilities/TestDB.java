package com.cybertek.dbUtilities;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TestDB {
    @Test
    public void dbTest() throws SQLException {
        JDBC.createConnection("jdbc:oracle:thin:@35.153.71.50:1521:xe",
                "SP","SP");

        ResultSet resultSet = JDBC.executeQuery("select * from spartans");
        resultSet.next();
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(2));

        ResultSetMetaData rsmd = resultSet.getMetaData();
        while (resultSet.next()) {
            for (int i = 1; i < rsmd.getColumnCount(); i++) {
                System.out.print(resultSet.getString(i)+" ");
            }
            System.out.println();
        }

    }
}
