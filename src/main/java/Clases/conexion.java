// @author Jose Chuchon
//Importacion de todos los paquetes para el funcionamiento de la clase  
//IMportacion de librerias para conectar sql con java
package Clases;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//creacion de la clase
public class conexion 
{
    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); 
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Declaracion de variables para conectar el sql
    Connection conectar=null;
    String usuario="usersql";
    String contrasenia="root";
    String bd="dbPlanillaColegio";
    String ip="localhost\\SQLEXPRESS";
    String puerto="1433";
    String cadena="jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
   
    //Declaracion de una clase para establecer la conexion con la base de datos
    public Connection establecerConexion(){
        
        //Uso de try-catch para verificar la funcionalidad de la conecccion 
       try{
           //establecer la conexion
        String cadena="jdbc:sqlserver://localhost:"+puerto+";"+"datebaseName="+bd+";TrustServerCertificate=True;";
        conectar =DriverManager.getConnection(cadena,usuario,contrasenia);
    
       }catch (Exception e){
           //Imprimir un mensaje cuando no se establece conexion con la base de datos
          JOptionPane.showMessageDialog(null,"Error al conectar a la base datos, error:"+ e.toString()+cadena+usuario+contrasenia); 
       } 
       //Retorna la comprobacion de la conexion de nuevo
        return conectar;
    }
}
