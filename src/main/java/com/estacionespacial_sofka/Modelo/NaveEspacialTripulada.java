package com.estacionespacial_sofka.Modelo;

public class NaveEspacialTripulada extends NaveEspacial {

    //ATRIBUTOS
    private double peso; //El peso en toneladas
    private double orbitacion; //En Km
    private int capacidadPersona; //Cantidad de personas

    //CONSTRUCTOR


    public NaveEspacialTripulada(String nombre, String descripcion, String combustibleYAgenteOxidante, String actividad, String potencia, String pais, double peso, double orbitacion, int capacidadPersona) {
        super(nombre, descripcion, combustibleYAgenteOxidante, actividad, potencia, pais);
        this.peso = peso;
        this.orbitacion = orbitacion;
        this.capacidadPersona = capacidadPersona;
    }


    //SETTERS Y GETTERS
    public double getPeso() {
        return peso;
    }

    public double getOrbitacion() {
        return orbitacion;
    }

    public int getCapacidadPersona() {
        return capacidadPersona;
    }

    //METODOS
    @Override
    public String funcionalidadPrincipal() {//Sobreecritura
        return "Envio de seres huamanos al espacio: ACTIVADO";
    }

    @Override
    public String funcionalidadSecundaria(){//Sobreecritura
        return "Inicio de reparación, mantenimiento y/o investigación: ACTIVADO";
    }
    @Override
    public String funcionalidadSecundaria(boolean peso) {//Sobrecarga
        if (peso == true) {
            return "Inicio de reparación y mantenimiento por " + capacidadPersona + " personas. " + "Pais de origen de la nave: " +
                    getPais() + "Peso de la nave: " + peso + ". Orbita: " + orbitacion + " Km. ";
        } else
            return "Inicio de reparación y mantenimiento por " + capacidadPersona + " personas. " + "Pais de origen de la nave: " +
                    getPais() + "Peso de la nave: " + peso + ". Orbita: " + orbitacion + " Km. ";
    }

    @Override
    public String toString() {
        return "\n\t Vehiculo Lanzadera {" +
                "Nombre = " + getNombre() +
                ", Descripcion = " + getDescripcion() +
                ", Combustible y agente oxidante = " + getCombustibleYAgenteOxidante() +
                ", actividad = " + getActividad() +
                ", potencia = " + getPotencia() +
                "\n" + "\t";
    }
}