package com.estacionespacial_sofka.Modelo;

public class VehiculoLanzadera extends NaveEspacial{

    //ATRIBUTOS
    private boolean verificacionCargaAtraidaPorGravedadTerreste;

    //CONSTRUCTOR


    public VehiculoLanzadera(String nombre, String descripcion, String combustibleYAgenteOxidante, String actividad, String potencia, String pais, boolean verificacionCargaAtraidaPorGravedadTerreste) {
        super(nombre, descripcion, combustibleYAgenteOxidante, actividad, potencia, pais);
        this.verificacionCargaAtraidaPorGravedadTerreste = verificacionCargaAtraidaPorGravedadTerreste;
    }

    //METODOS
    @Override
    public String funcionalidadPrincipal() { //Sobreescritura

        return "Lanzamiento de carga util al espacio: ACTIVADO. ";
    }

    @Override
    public String funcionalidadSecundaria() {//Sobreescritura

        return "Colocar la carga util en orbita: ACTIVADO";
    }

    @Override
    public String funcionalidadSecundaria(boolean verificacionCargaAtraidaPorGravedadTerreste) { //Sobrecarga

        if (verificacionCargaAtraidaPorGravedadTerreste == true)
            return "La carga útil en orbita se precipita radialmente atrída por la intensidad de la gravedad terreste: " +
                    verificacionCargaAtraidaPorGravedadTerreste + " ¡ESTADO EN PELIGRO!";
        else if (verificacionCargaAtraidaPorGravedadTerreste == false)
            return "La carga útil en orbita se precipita radialmente atrída por la intensidad de la gravedad terreste: " +
                    verificacionCargaAtraidaPorGravedadTerreste + " ¡ESTADO CORRECTO!";
        else
            return "Verificacion de carga atraida por gravedad terrestre INCORRECTA";
    }

    @Override
    public String toString() { //clase hereda de Object, intenta representar con texto el objeto
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

