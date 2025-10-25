/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerfaces;

/**
 *
 * @author notvo
 */
public class ExamenEscrito extends Examen {

    private final int MIN_NOTA = 0;
    private final int MAX_NOTA = 10;
    private final int NOTA_APROB = 6;
    private final int MIN_DURACION = 90;

    private int duracion;
    private int nota;

    public ExamenEscrito(int duracion, int nota, String fecha) {
        super(fecha);
        this.duracion = duracion;
        this.nota = nota;
    }

//    public boolean duracionCorrecta(){
//        return duracion <= MIN_DURACION;
//    }
//    
//    public boolean notaAprobadoValida(){
//        return nota >= MIN_NOTA && nota<= MAX_NOTA;
//    }
//    
//    public boolean notaAprobado(){
//        return notaAprobadoValida() && nota > NOTA_APROB;
//    }
//    
    @Override
    public boolean aprobo() {
        return nota >= MIN_NOTA && nota <= MAX_NOTA && nota >= NOTA_APROB && duracion <= MIN_DURACION;
    }

}
