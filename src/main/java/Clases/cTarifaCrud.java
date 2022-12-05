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
        
        int registroAdd=statement.executeUpdate();
        
        if (registroAdd>0){
          System.out.println("OK");
           JOptionPane.showMessageDialog(null,"Ok, Registro Correcto"); 
        }
        
        }catch(SQLException e){
         e.printStackTrace();
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
               Object dato []= new Object[4];
             for (int i=0;i<4;i++){
                dato[i]=rs.getString(i+1);
             }
              modelo.addRow(dato);
            }

            }catch(SQLException e){
             e.printStackTrace();
             JOptionPane.showMessageDialog(null,"error"+e.toString()); 
            }
   return modelo;        
   } 
    //Creacion de un modificador public con sus parametros para almacenar en sql
      public  void eliminarTarifa(Connection conexion, String IdUsuario){
           
    try{
         CallableStatement cmd=conexion.prepareCall("{call SP_ELIMINAR_TARIFA(?)}");
            cmd.setString(1, IdUsuario);
            ResultSet rs= cmd.executeQuery();
       
        
        }catch(SQLException e){
         e.printStackTrace();
         JOptionPane.showMessageDialog(null,"error"+e.toString()); 
        }
    }
}
