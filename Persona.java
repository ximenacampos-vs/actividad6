/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

/**
 *
 * @author ximena
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private String luigarConsulta;
    private String medicoTratante;
    private String direccionResidencia;
    private String fecha;
    private int id;
    
    
    public Persona(){
        
        this.nombre = null;
        this.apellido = null;
        this.sexo = null;
        this.luigarConsulta = null;
        this.medicoTratante = null;
        this.direccionResidencia = null;
        this.fecha = null;
        
    }
    
    public Persona (String nombre,String apellido, String sexo, String lugarConsulta, String medicoTratante, String direccionResidencia, String fecha ){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.luigarConsulta = lugarConsulta;
        this.medicoTratante = medicoTratante;
        this.direccionResidencia = direccionResidencia;
        this.fecha = fecha;
        
    }
    
    public void mostrarPersona(){
        
        System.out.println("nombre de la persona:" +nombre);
         System.out.println();
        System.out.println("apellido de la persona:" +apellido);
         System.out.println();
        System.out.println("sexo de la persona:" +sexo);
         System.out.println();
        System.out.println("lugar de la consulta:" +luigarConsulta);
         System.out.println();
        System.out.println("nombre del medico:" +medicoTratante);
         System.out.println();
        System.out.println("direccion de donde recide la persona:" +direccionResidencia);
         System.out.println();
        System.out.println("fecha de la consulta:" +fecha);
         System.out.println();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLuigarConsulta() {
        return luigarConsulta;
    }

    public void setLuigarConsulta(String luigarConsulta) {
        this.luigarConsulta = luigarConsulta;
    }

    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    void getNombre(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
