/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import jdk.nashorn.internal.ir.Statement;

/**
 *
 * @author User
 */
public class Main {
    public static void foo() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        String url="jdbc:mysql://localhost:3306/resumee";
        String username="root";
        String password="";
        Connection c=DriverManager.getConnection(url,username,password);
       Statement stmt=c.createStatement();
       stmt.execute("select *from user");
       ResultSet rs= stmt.getResultSet();
       while(rs.next()){
       int id=rs.getInt("id");
            String name=rs.getString("name");
            String surname=rs.getString("surname");
            String phone=rs.getString("phone");
            String email=rs.getString("email");
            System.out.println("id"+id);
            System.out.println("name"+name);
            System.out.println("surname"+surname);
            System.out.println("phone"+phone);
            System.out.println("email"+email);
            System.out.println("-------------------------------");
       
       }
       
       System.out.println(c.getClass().getName()); 
    }
    public static void main(String[] args)throws Exception {
        foo();
    }
}
