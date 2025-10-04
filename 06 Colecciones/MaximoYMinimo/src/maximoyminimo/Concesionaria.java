/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maximoyminimo;

import java.util.ArrayList;

/**
 *
 * @author notvo
 */
public class Concesionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        autos.add(a);
    }

    public int cantAutos() {
        return autos.size();
    }

    public Auto autoMasKmRecorridos() {
        Auto autoMax = null;
        int kmsMax = Integer.MIN_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmRecorridos() > kmsMax) {
                autoMax = auto;
            }
        }
        return autoMax;
    }

    public Auto autoMenosKmRecorridos() {
        Auto autoMin = null;
        int kmsMin = Integer.MAX_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmRecorridos() < kmsMin) {
                autoMin = auto;
            }
        }
        return autoMin;
    }

//    public ArrayList<Auto> autosMasKmRecorridos() {
//        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
//        int kmsMax = Integer.MIN_VALUE;
//        for (Auto auto : autos) {
//            if (auto.getKmRecorridos() > kmsMax) {
//                listaDeMaximos.add(auto);
//            }
//        }
//        return listaDeMaximos;
//    }
    public ArrayList<Auto> autosMasKmsRecorridos() {
        ArrayList<Auto> listaDeMaximos = new ArrayList<>();
        int kmsMax = Integer.MIN_VALUE;
        for (Auto auto : autos) {
            if (auto.getKmRecorridos() == kmsMax) {
                listaDeMaximos.add(auto);
            } else if (auto.getKmRecorridos() > kmsMax) {
                kmsMax = auto.getKmRecorridos();
                listaDeMaximos.clear();
                listaDeMaximos.add(auto);
            }
        }
        return listaDeMaximos;
    }

}
