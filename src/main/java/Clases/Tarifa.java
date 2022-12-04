package Clases;
/*
 * @author Lobito
*/

//Esta clase está referida al caso de uso de Registrar Tarifa
public class Tarifa {
    //Variables o Atributos
    int IdTarifa;
    String Codigo;
    String Precio;
    String Categoria;
    
    //Constructor
    public Tarifa(int IdTarifa, String Codigo, String Precio, String Categoria) {
        this.IdTarifa = IdTarifa;
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Categoria = Categoria;
    }
    
    //Getters and Setters
    public int getIdTarifa() {
        return IdTarifa;
    }

    public void setIdTarifa(int IdTarifa) {
        this.IdTarifa = IdTarifa;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    

    
}
