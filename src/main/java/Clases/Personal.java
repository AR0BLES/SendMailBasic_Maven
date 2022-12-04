package Clases;
/*
 * @author Lobito
*/

//Esta clase está referida al caso de uso de Registrar Personal
public class Personal {
    //Variables o Atributos
    public String Nombres ; //Nombre del personal
    public String Apellidos ; //Apellido del personal
    public String DNI ; //DNI del personal
    public String FechaNacimiento ; //Fecha de nacimiento del personal
    public String NroHijos ; //Número de hijos del personal
    public String CuentaBancaria ; //Cuenta bancaria del personal
    public String CorreoElectronico ; //Correo electrónico del personal
    public String Deduccion ; //Si pertenece a SNP o SPP
    public String Categoria ; //Si pertenece a 4ta o 5ta Categoría
    public String Estado ; //Si está activo o inactivo
    public String Puesto ; //Si es docente o administrador
    public String Nivel ; //Si pertene a inicial, primaria o secundaria
    public int IdUsuario;
    
    
    //Constructor
    public Personal(String Nombres, String Apellidos, String DNI, String FechaNacimiento, String NroHijos, String CuentaBancaria, String CorreoElectronico, String Deduccion, String Categoria, String Estado, String Puesto, String Nivel, int IdUsuario) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.FechaNacimiento = FechaNacimiento;
        this.NroHijos = NroHijos;
        this.CuentaBancaria = CuentaBancaria;
        this.CorreoElectronico = CorreoElectronico;
        this.Deduccion = Deduccion;
        this.Categoria = Categoria;
        this.Estado = Estado;
        this.Puesto = Puesto;
        this.Nivel = Nivel;
        this.IdUsuario = IdUsuario;
    }
    
    //Getters and Setters
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNroHijos() {
        return NroHijos;
    }

    public void setNroHijos(String NroHijos) {
        this.NroHijos = NroHijos;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getDeduccion() {
        return Deduccion;
    }

    public void setDeduccion(String Deduccion) {
        this.Deduccion = Deduccion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    

    
}
