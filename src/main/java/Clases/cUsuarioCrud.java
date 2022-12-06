// @author Jose Chuchon
//Importacion de todos los paquetes para el funcionamiento de la clase  
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

//Creacion  de  una clase cUsuarioCrud
public class cUsuarioCrud {
    //Creacion de un modificador public con sus parametros para almacenar en sql
    //con los variables donde se va almacenar los datos correspondientes
     public  void insertarUsuario(Connection conexion, Usuario usuario){
    String sql ="INSERT INTO Usuario VALUES (?,?);";
    
    try{
         //Sentecia de sql para alamacenar un dato alamacenado en la base de datos
         //variables de la clase usuario que se estan usando 
        PreparedStatement statement= conexion.prepareStatement(sql);
        statement.setString(1, usuario.usuario);
        statement.setString(2, usuario.clave);
        
         //Creacion de varibale para agregar nuevos datos en la tabla
        int registroAdd=statement.executeUpdate();
        
        //uso de una condicion cuando el registro sea mayor que cero
        if (registroAdd>0){
             //Imprimir un mensaje cuando el registro sea exitoso
          System.out.println("OK");
        }
        
    }catch(SQLException e){
     e.printStackTrace();
     //Imprimir un mensaje si los datos no se guardan 
     JOptionPane.showMessageDialog(null,"error"+e.toString()); 
    }
    }
     //Creacion de un modificador public con sus parametros para almacenar en sql
      public  int ObtenerIdUsuario(Connection conexion,String Usuario){
          //Declaracion de variable que inicia en Cero
          //para ser alamcenado en la base de datos
       Integer valor=0;
       String sql="SELECT * FROM usuario WHERE Usuario='"+Usuario+"'";
       
          try{
              // Variable pra procesar una sentencia SQL estática
            Statement statement = conexion.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            while(rs.next()){
             valor= rs.getInt(1);
            }
            //Imprimir un mensaje cuando el registro sea exitoso
             JOptionPane.showMessageDialog(null,"ok"+valor); 
            }catch(SQLException e){
             e.printStackTrace();
             //Imprimir un mensaje si los datos no se guardan 
             JOptionPane.showMessageDialog(null,"error"+e.toString()+sql); 
            }
        //el valor que retorna de nuevo
       return valor;
   } 
     
    //Creacion de un modificador public con sus parametros para almacenar en sql
   public  int ValidarLoginUsuario(Connection conexion,String Usuario,String Clave){
       //Declaracion de variable que inicia en Cero
          //para ser alamcenado en la base de datos
       Integer valor=0;
       String sql="SELECT * FROM usuario WHERE Usuario='"+Usuario+"' AND Clave='"+Clave+"'";
       
          try{
              // Variable pra procesar una sentencia SQL estática
            Statement statement = conexion.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            //sentencia que suma al valor de la tabla uno mas 
             while(rs.next()){
                 valor=valor+1;
            }
             
            }catch(SQLException e){
             e.printStackTrace();
             //Imprimir un mensaje si los datos no se guardan 
             JOptionPane.showMessageDialog(null,"error"+e.toString()); 
            }
              
         //el valor que retorna de nuevo
       return valor;
   } 
    
    
}

