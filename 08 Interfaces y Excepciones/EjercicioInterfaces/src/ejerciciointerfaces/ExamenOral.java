/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerfaces;

/**
 *
 * @author notvo
 */
public class ExamenOral extends Examen {
    private NivelSatisfaccion satisfaccion;
    private final NivelSatisfaccion NOTA_APROBADO = NivelSatisfaccion.SUFICIENTE;
    

    
    public ExamenOral(NivelSatisfaccion satisfaccion, String fecha) {
        super(fecha);
        this.satisfaccion = satisfaccion;
    }


    
    
    @Override
    public boolean aprobo() {
        return satisfaccion.ordinal()>= NOTA_APROBADO.ordinal();
    }
}
