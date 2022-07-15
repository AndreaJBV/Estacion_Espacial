package com.estacionespacial_sofka.Modelo;

public class NaveRobotica extends NaveEspacial {

    //ATRIBUTOS
    private String cuerpoCeleste;
    private double empuje;

    //CONSTRUCTOR


    public NaveRobotica(String nombre, String descripcion, String combustibleYAgenteOxidante, String actividad, String potencia, String pais, String cuerpoCeleste, double empuje) {
        super(nombre, descripcion, combustibleYAgenteOxidante, actividad, potencia, pais);
        this.cuerpoCeleste = cuerpoCeleste;
        this.empuje = empuje;
    }

    //METODOS
    @Override
    public String funcionalidadPrincipal() {//Sobreescritura
        return "Abastecimiento, limpieza y regulacion periódica de la elevación de la EEI: ACTIVADA";
    }

    @Override
    public String funcionalidadSecundaria(){ //Sobrecarga
        if (cuerpoCeleste =="Saturno") {
            return "Cuerpo celese a estudiar: " + cuerpoCeleste + ". Combustible: Tetroxido de nitrogeno " + ". Empuje: " + empuje + " Kg" +
                    ". Velocidad: 18000 Km/h " + ". Sonda: Sin información";
        } else if (cuerpoCeleste =="Jupiter") {
            return "Cuerpo celese a estudiar: " + cuerpoCeleste + ". Combustible: Sin informacion " + ". Empuje: " + empuje + " Kg" +
                    ". Velocidad: Sin informacion " + ". Sonda: Pionero X2";
        } else if (cuerpoCeleste =="Marte") {
            return "Cuerpo celese a estudiar: " + cuerpoCeleste + ". Combustible: Hidracina " + ". Empuje: " + empuje + " Kg" +
                    ". Velocidad: Sin informacion " + ". Sonda: Mariner IV";
        } else
            return "Cuerpo celeste no encontrado";
    }

    @Override
    public String funcionalidadSecundaria(boolean cuerpoCeleste){//Sobrecarga
        if(cuerpoCeleste == true){
            return "Si hay cuerpo celeste a estudiar";
        }else
            return "No hay cuepro celeste a estudiar";
    }


    public String toString() {
        return "\n\t Vehiculo Lanzadera {" +
                "Nombre = " + getNombre() +
                ", Descripcion = " + getDescripcion() +
                ", Combustible y agente oxidante = " + getCombustibleYAgenteOxidante() +
                ", actividad = " + getActividad() +
                ", potencia = " + getPotencia() +
                ", pais de origen = " + getPais() +
                '}' + "\n" + "\t";
    }
}

