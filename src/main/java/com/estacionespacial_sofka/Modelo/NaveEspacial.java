package com.estacionespacial_sofka.Modelo;

public abstract class NaveEspacial {

    //ATRIBUTOS
    private String nombre;
    private String descripcion;
    private String combustibleYAgenteOxidante;
    private String actividad;
    private String potencia;

    private String pais;

    //CONTRUCTOR
    public NaveEspacial(String nombre, String descripcion, String combustibleYAgenteOxidante, String actividad, String potencia, String pais) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.combustibleYAgenteOxidante = combustibleYAgenteOxidante;
        this.actividad = actividad;
        this.potencia = potencia;
        this.pais = pais;
    }

    //METODOS
    public abstract String funcionalidadPrincipal();

    public abstract String funcionalidadSecundaria();

    public abstract String funcionalidadSecundaria(boolean bolean); //Sobreescritura


    //SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCombustibleYAgenteOxidante() {
        return combustibleYAgenteOxidante;
    }

    public String getActividad() {
        return actividad;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getPais() {
        return pais;
    }


}