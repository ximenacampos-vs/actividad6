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
public class Medico extends Persona{
    
    private String tipoMedico;
    
    public Medico(){
        this.tipoMedico = null;
    }
    
    public Medico(String tipoMedico, String nombre,String apellido, String lugarConsulta, String fecha){
        super(nombre, apellido, fecha, lugarConsulta, fecha, lugarConsulta, fecha);
        this.tipoMedico = tipoMedico;
    }

    public String getTipoMedico() {
        return tipoMedico;
    }

    public void setTipoMedico(String tipoMedico) {
        this.tipoMedico = tipoMedico;
    }

    void getMedicoTratante(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
