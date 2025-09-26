/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajointegradorpoo;

/**
 *
 * @author notvo
 */
public class TarjetaDeCredito {

    private EntidadFinanciera entidad;
    private Usuario titular;
    private String EtidadBancaria;
    private String numTarjeta;
    private double saldoDisponible;

    public TarjetaDeCredito(EntidadFinanciera entidad, Usuario usuario, String EtidadBancaria, String numTarjeta, double saldoDisponible) {
        this.entidad = entidad;
        this.titular = usuario;
        this.EtidadBancaria = EtidadBancaria;
        this.numTarjeta = numTarjeta;
        this.saldoDisponible = saldoDisponible;
    }

    public String getCliente() {
        return this.titular.getNombreCompleto();
    }

    public void realizarGasto(double gasto) {
        if (validarGasto(gasto)) {
            this.saldoDisponible -= gasto;
        }
    }
    
    public boolean validarGasto(double gasto){
        return gasto <= this.saldoDisponible;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidad=" + entidad + ", titular=" + titular + ", EtidadBancaria=" + EtidadBancaria + ", numTarjeta=" + numTarjeta + ", saldoDisponible=" + saldoDisponible + '}';
    }

}
