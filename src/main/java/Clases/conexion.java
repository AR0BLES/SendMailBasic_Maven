// @author Jose Chuchon
//Importacion de todos los paquetes para el funcionamiento de la clase  
package Clases;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion 
{

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conectar=null;
    String usuario="usersql";
    String contrasenia="root";
    String bd="dbPlanillaColegio";
    String ip="localhost\\SQLEXPRESS";
    String puerto="1433";
   // public Connection cn=null;
   // public Statement st =null;
    
    String cadena="jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
   
    public Connection establecerConexion(){
       try{
        String cadena="jdbc:sqlserver://localhost:"+puerto+";"+"datebaseName="+bd+";TrustServerCertificate=True;";
       
        conectar =DriverManager.getConnection(cadena,usuario,contrasenia);
     //   st=cn.createStatementResultSettement(createStatementResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        //JOptionPane.showMessageDialog(null,"Ok, Conexión Correcta"); 
       }catch (Exception e){
          JOptionPane.showMessageDialog(null,"Error al conectar a la base datos, error:"+ e.toString()+cadena+usuario+contrasenia); 
       } 
        return conectar;
    }
}
