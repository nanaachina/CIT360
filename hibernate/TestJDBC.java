/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author adm-achina
 */

public class TestJDBC {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try{
            System.out.println("Connecting to database: " + jdbcURL);

            Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);

            System.out.println("Connection successful!");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
