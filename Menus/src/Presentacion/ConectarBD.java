/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Fredi
 */
public class ConectarBD {
    
public Connection conexion;
public PreparedStatement sentencia;
public ConectarBD(){
//String ruta = "jdbc:posgrest://localhost:5432/parking"; //"jdbc:posgrest://localhost:5432/trabajo" //"jdbc:mysql://localhost/parque"
String ruta ="jdbc:postgresql://localhost:5432/parking";

try {
 Class.forName("org.postgresql.Driver"); //"org.posgret.jdbc.Driver" //"com.mysql.jdbc.Driver"
conexion=DriverManager.getConnection(ruta,"postgres","fredi");//ruta,"posgrest","123456"   //ruta,"root","123456"
}
catch(ClassNotFoundException e )
{
System.out.println("Error:"+e);
}
catch(SQLException e )
{
System.out.println("Error en la conexion: "+e);
}
}
public Connection getConexion()
{
return conexion;
}
public void setConexion(Connection conexion)
{
this.conexion = conexion;
}
    
}
