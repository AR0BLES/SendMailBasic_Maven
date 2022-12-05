// @author Jose Chuchon

//Importacion de todos los paquetes para el funcionamiento de la clase 

package Clases;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Creacion  de  una clase 
public class cTarifaCrud {
    //Creacion de un modificador public con sus parametros para almacenar en sql
    //con los variables donde se va almacenar los datos correspondientes
    public  void insertarTarifa(Connection conexion, Tarifa tarifa){
    String sql ="INSERT INTO Tarifa VALUES (?,?,?);";
    
    // Se usa el try-catch para  detectar y controlar una excepción de codigo
    //para manejar fragmentos de código que son propensos a fallar
    try{
        PreparedStatement statement= conexion.prepareStatement(sql);
        //Uso de los varibales de la clase (TarifaDoc)
        statement.setString(1, tarifa.Codigo);
        statement.setString(2, tarifa.Precio);
        statement.setString(3, tarifa.Categoria); 
        
        //Creacion de varibale para agregar nuevos datos en la tabla
        int registroAdd=statement.executeUpdate();
        
        //uso de una condicion cuando el registro sea mayor que cero
        if (registroAdd>0){
          System.out.println("OK");
          //Imprimir un mensaje cuando el registro sea exitoso
           JOptionPane.showMessageDialog(null,"Ok, Registro Correcto"); 
        }
        
        }catch(SQLException e){
         e.printStackTrace();
         //Imprimir un mensaje cuando el registro no se registre
         JOptionPane.showMessageDialog(null,"error"+e.toString()); 
        }
    }
    //Creacion de un modificador public con sus parametros para almacenar en sql
    //Para insertar los datos en la tabla de Jframe
    public  DefaultTableModel ListarTarifa(Connection conexion){
        DefaultTableModel modelo=new  DefaultTableModel();
        //columnas con sus nombres de la Tabla ListaTarifa
        modelo.addColumn("IdTarifa");
        modelo.addColumn("Codigo");
        modelo.addColumn("Precio");
           modelo.addColumn("Categoria");  
        
          try{
            CallableStatement cmd=conexion.prepareCall("{CALL SP_LISTAR_TARIFA}");
            ResultSet rs= cmd.executeQuery();
            while(rs.next()){
                //Creacion de un Array que nos permite almacenar 
                //datos ingresados en la tabla
               Object dato []= new Object[4];
             for (int i=0;i<4;i++){
                dato[i]=rs.getString(i+1);
             }
             //guardar los datos ingresados en la tabla para su visualizacion
              modelo.addRow(dato);
            }

            }catch(SQLException e){
             e.printStackTrace();
             //Imprimir un mensaje si los datos no se guardan 
             JOptionPane.showMessageDialog(null,"error"+e.toString()); 
            }
   return modelo;        
   } 
    //Creacion de un modificador public con sus parametros para almacenar en sql
      public  void eliminarTarifa(Connection conexion, String IdUsuario){
           
    try{
        //Sentecia de sql para llamar un dato alamacenado en la base de datos
         CallableStatement cmd=conexion.prepareCall("{call SP_ELIMINAR_TARIFA(?)}");
            cmd.setString(1, IdUsuario);
            ResultSet rs= cmd.executeQuery();
       
        
        }catch(SQLException e){
         e.printStackTrace();
          //Imprimir un mensaje si los datos no se guardan 
         JOptionPane.showMessageDialog(null,"error"+e.toString()); 
        }
    }
}
