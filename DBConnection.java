/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;


public abstract class DBConnection {
    Connection conn = dbConnection();
    
    public Connection dbConnection() {
        // load driver
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Error Loading Driver: " + cnfe);
        }

        // Establish connection
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/java_class_db", "root", "myspassword");
            System.out.println("Database Connection successfull");
        }catch(SQLException sqle){
            System.out.println("Could not establish connection " + sqle.getMessage());
        }
        return conn;
    }
    
    public abstract void insertOperation(String student_name, String student_course, String student_years);
    
    public abstract void updateOperation(String student_id);
    
    public abstract void deleteOperation(int student_id);
    
    public abstract void selectOperation(String new_student_id);
}
