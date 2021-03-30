
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

import javax.swing.JOptionPane;

/**
 *
 * @author ximena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona paciente = new Persona();
        Medico medico = new Medico();
        Hospital hospital = new Hospital();
        
        paciente.getNombre(Integer.parseInt(JOptionPane.showInputDialog("Digite su nombre")));
        medico.getMedicoTratante(Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre y tipo de medico")));
        hospital.getNombreHospital(Integer.parseInt(JOptionPane.showInputDialog("Digite el nombre del hospital y el nivel")));
        
        imprimir(paciente.getNombre());
        imprimir(paciente.getApellido());
        imprimir(paciente.getDireccionResidencia());
        imprimir(paciente.getSexo());
        imprimir(paciente.getFecha());
        imprimir(paciente.getLuigarConsulta());
        imprimir(paciente.getMedicoTratante());
        imprimir(medico.getTipoMedico());
        imprimir(medico.getNombre());
        imprimir(medico.getApellido());
        imprimir(medico.getLuigarConsulta());
        imprimir(hospital.getNombreHospital());
        imprimir(hospital.getDireccion());
        
    }

    private static void imprimir(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
