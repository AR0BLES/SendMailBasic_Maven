package Clases;
/*
 * @author Lobito
*/

//Esta clase está referida al caso de uso de exportar planilla en excel
public class Planilla {
    //Variables o Atributos
    String CodigoPersonal; //Código del personal
    String Mes; //Mes de la planilla a exportar
    String Anio; //Año de la planilla a exportar
    
    //Constructor
    public Planilla(String CodigoPersonal, String Mes, String Anio) {
        this.CodigoPersonal = CodigoPersonal;
        this.Mes = Mes;
        this.Anio = Anio;
    }
    
    //Getters and Setters
    public String getCodigoPersonal() {
        return CodigoPersonal;
    }

    public void setCodigoPersonal(String CodigoPersonal) {
        this.CodigoPersonal = CodigoPersonal;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String Anio) {
        this.Anio = Anio;
    }
    
    
   
}
