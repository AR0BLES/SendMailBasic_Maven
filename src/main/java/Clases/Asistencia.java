package Clases;
public class Asistencia {
//Variables

String codigo;
String Nombre;
String Apellido;
String Asistencia;
String Tardanza;
String Falta;
String Justificada;
String Totalasistencia;
String HoraporAsistencia;
String TotalHora;
String Mes;

//Constructor
    public Asistencia(String codigo, String Nombre, String Apellido, String Asistencia, String Tardanza, String Falta, String Justificada, String Totalasistencia, String HoraporAsistencia, String TotalHora, String Mes) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Asistencia = Asistencia;
        this.Tardanza = Tardanza;
        this.Falta = Falta;
        this.Justificada = Justificada;
        this.Totalasistencia = Totalasistencia;
        this.HoraporAsistencia = HoraporAsistencia;
        this.TotalHora = TotalHora;
        this.Mes = Mes;
    }
}
