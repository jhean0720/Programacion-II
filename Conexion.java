/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Jheanfer Geronimo
 */
public class Conexion {
    public static Connection getConexion(){
        try{
           Class.forName("com.myslq.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica","root","");
           return connection;
          }catch(Exception e){
             e.printStackTrace();
          }
        return null;
    }
}
