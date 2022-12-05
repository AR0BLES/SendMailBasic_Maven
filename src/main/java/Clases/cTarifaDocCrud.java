// @author Jose Chuchon
//Importacion de todos los paquetes para el funcionamiento de la clase  
package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Creacion  de  una clase cTarifaDocCrud
public class cTarifaDocCrud {
     //Creacion de un modificador public con sus parametros para almacenar en sql
    //con los variables donde se va almacenar los datos correspondientes
    public  void insertarTarifaDoc(Connection conexion, TarifaDoc tarifadoc){
    String sql ="INSERT INTO TarifaDocente VALUES (?,?);";
    
    // Se usa el try-catch para  detectar y controlar una excepción de codigo
    //para manejar fragmentos de código que son propensos a fallar
    try{
        //Uso de los varibales de la clase 
        PreparedStatement statement= conexion.prepareStatement(sql);
        statement.setInt(1, tarifadoc.IdTarifa);
        statement.setInt(2, tarifadoc.IdPersonal);

          //Creacion de varibale para agregar nuevos datos en la tabla
        int registroAdd=statement.executeUpdate();
         //uso de una condicion cuando el registro sea mayor que cero
        if (registroAdd>0){
            //Imprimir un mensaje cuando se agrega un nuevo dato
          System.out.println("OK");
        }
        
        }catch(SQLException e){
         e.printStackTrace();
          //Imprimir un mensaje cuando no se puede agrega un nuevo dato
         JOptionPane.showMessageDialog(null,"error"+e.toString()); 
        }
    }
        // //Creacion de un modificador public con sus parametros para almacenar en sql
        //Para insertar los datos en la tabla de Jframe ObtenerIdPersonal
        public  int ObtenerIdPersonal(Connection conexion,String Usuario){
            //Declaracion de una variable que inicia en cero
        Integer valor=0;
        //Alamcenar los datos dentro de la BD
         String sql="SELECT IdPersonal FROM PERSONAL P INNER JOIN USUARIO U ON "
               + "P.IdUsuario=U.Id_Usuario WHERE Usuario='"+Usuario+"'";   
         
         // Se usa el try-catch para  detectar y controlar una excepción de codigo
        //para manejar fragmentos de código que son propensos a fallar
          try{
            Statement statement = conexion.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            //Uso de una sentencia while para verificar los datos que se quieren mostrar
            while(rs.next()){
             valor= rs.getInt(1);
            }
            //Imprimir un mensaje cuando se ejecuta correctamente
             JOptionPane.showMessageDialog(null,"ok"+valor); 
            }catch(SQLException e){
             e.printStackTrace();
             //Imprimir un mensaje cuando no se ejecuta correctamente
             JOptionPane.showMessageDialog(null,"error"+e.toString()+sql); 
            }
       return valor;
   }    
        //Creacion de un modificador public con sus parametros para almacenar en sql
        public  DefaultTableModel ListarTarifaDoc(Connection conexion,Integer idtarifa){
            //columnas con sus nombres de la Tabla ListaTarifaDoc
            DefaultTableModel modelo=new  DefaultTableModel();
            modelo.addColumn("IdTarifaDoc");
            modelo.addColumn("IdTarifa");
            modelo.addColumn("IdDocente");
            modelo.addColumn("CodigoTarifa");
            modelo.addColumn("CodigoPersonal");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellidos"); 
            
              try{
                CallableStatement cmd=conexion.prepareCall("{CALL SP_LISTAR_TARIFADOC(?)}");
                cmd.setInt(1,idtarifa);
                ResultSet rs= cmd.executeQuery();
                
                while(rs.next()){
                   //Creacion de un Array que nos permite almacenar 
                //datos ingresados en la tabla
                   Object dato []= new Object[6];
                 for (int i=0;i<6;i++){
                    dato[i]=rs.getString(i+1);
                 }
                  //guardar los datos ingresados en la tabla para su visualizacion
                  modelo.addRow(dato);
                }

                }catch(SQLException e){
                 e.printStackTrace();
                 //Imprimir un mensaje cuando no se ejecuta correctamente
                 JOptionPane.showMessageDialog(null,"error"+e.toString()); 
                }
       return modelo;        
       } 
    public  void eliminarTarifaDoc(Connection conexion, String IdUsuario){      
    try{
         //Sentecia de sql para llamar un dato alamacenado en la base de datos
        CallableStatement cmd=conexion.prepareCall("{call SP_ELIMINAR_TARIFADOC(?)}");
           
        cmd.setString(1, IdUsuario);
        ResultSet rs= cmd.executeQuery();
        
        }catch(SQLException e){
         e.printStackTrace();
         //Imprimir un mensaje cuando no se ejecuta correctamente
         JOptionPane.showMessageDialog(null,"error"+e.toString()); 
        }
    }
}
