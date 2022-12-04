package Clases;
/*
 * @author Lobito
*/

//Esta clase está referida al caso de uso de Registrar Horario
public class Horario {
    //Variables
    int IdPersonal; 
    String HoraInicio; //Hora de inicio de jornada
    String HoraFin; //Hora final de jornada
    String CantidadHora; //Cantidad de horas semanales
    String Curso; //Curso que dictará
    String CantidadDiaLab; //Cantidad de días laborales
    String Dias; //Días laborales
    
    //Constructor
    public Horario(int IdPersonal, String HoraInicio, String HoraFin, String CantidadHora, String Curso, String CantidadDiaLab, String Dias) {
        this.IdPersonal = IdPersonal;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.CantidadHora = CantidadHora;
        this.Curso = Curso;
        this.CantidadDiaLab = CantidadDiaLab;
        this.Dias = Dias;
    }
    
    //Getters and Setters
    public int getIdPersonal() {
        return IdPersonal;
    }

    public void setIdPersonal(int IdPersonal) {
        this.IdPersonal = IdPersonal;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public String getCantidadHora() {
        return CantidadHora;
    }

    public void setCantidadHora(String CantidadHora) {
        this.CantidadHora = CantidadHora;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getCantidadDiaLab() {
        return CantidadDiaLab;
    }

    public void setCantidadDiaLab(String CantidadDiaLab) {
        this.CantidadDiaLab = CantidadDiaLab;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String Dias) {
        this.Dias = Dias;
    }
    
    

}
