package com.estacionespacial_sofka.Modelo;

import java.util.ArrayList;
import java.util.List;

public class EstacionEspacialSofka {

    //ATRIBUTOS
    private List<NaveEspacial> navesEspaciales;

    //CONSTRUCTOR
    public EstacionEspacialSofka() {
        navesEspaciales = new ArrayList<NaveEspacial>();
    }

    //METODOS
    public void crearNaveEspacial(String codigo){
        try{
            navesEspaciales.add(NaveEspacialFactory.getInstance().generarNaveEspacial(codigo));
        } catch (NaveEspacialException e){
            throw new RuntimeException(e);
        }
    }

    public String generarConsulta(){
        String consulta = "";
        for (NaveEspacial naveEspacial : navesEspaciales) {
            consulta += naveEspacial.toString() + "\n";
        }
        return consulta;
    }
}
