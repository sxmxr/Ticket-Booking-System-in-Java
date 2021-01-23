/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_project;

import java.sql.*;


public class DB_Connect {
    
    public static Connection getConnection()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticket","root","");
            //st = con.createStatement();
            
            
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
   
