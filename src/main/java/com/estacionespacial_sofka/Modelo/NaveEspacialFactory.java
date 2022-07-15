package com.estacionespacial_sofka.Modelo;

public class NaveEspacialFactory {

    //ATRIBUTOS
    private static NaveEspacialFactory instance;
    public static final String CODIGO_SATURNO_V = "SATURNO-V";
    public static final String CODIGO_ARAINE_V = "ARAINE-V";
    public static final String CODIGO_LARGA_MARCHA_2F = "LARGA-MARCHA-2F";

    public static final String CODIGO_ATV = "ATV";
    public static final String CODIGO_LUNA_IX = "LUNA-IX";
    public static final String CODIGO_CURIOSIDAD = "CURIOSIDAD";

    public static final String CODIGO_SKYLAB = "SKYLAB";
    public static final String CODIGO_SALYUT = "SALYUT";
    public static final String CODIGO_EEI = "EEI";


    //CONSTRUCTOR PRIVADO
    private NaveEspacialFactory(){

    }


    //METODOS
    public static NaveEspacialFactory getInstance(){
        if(instance == null)
            instance = new NaveEspacialFactory();
        return instance;
    }

    public NaveEspacial generarNaveEspacial(String codigo) throws NaveEspacialException {
        switch (codigo){
            case CODIGO_SATURNO_V:
                return new VehiculoLanzadera("Saturno V", "Cohete autopropulsado más potente jamás construido.", "Solido*+Queroseno+N(liq)", "1967-1973", "Alta","EE.UU",true);
            case CODIGO_ARAINE_V:
                return new VehiculoLanzadera("Ariane V", "Cohete autopropulsado desarrollado y operado por Arianespace para la Agencia Espacial Europea (ESA). ", "Solido+N(liq)+O(liq)", "1996-Act", "Media","Europa",true);
            case CODIGO_LARGA_MARCHA_2F:
                return new VehiculoLanzadera("Larga Marcha 2F", "Cohete autopropulsado de la familia Larga Marcha formado por cuatro cohetes adicionales laterales.", "UDMH+N2O4", "1999-Act", "Minima","China",false);
            case CODIGO_ATV:
                return new NaveRobotica("ATV***", "El lanzamiento de la primera de estas naves, llamada ATV-001 Julio Verne en honor del escritor francés, se realizó el día 9 de marzo de 2008.", "MMM**+NO", "2008-Act", "Alta","Europa","Saturno", 45.39);
            case CODIGO_LUNA_IX:
                return new NaveRobotica("Luna IX", "Fue el primer objeto construido por el hombre en posarse suavemente en otro cuerpo celeste.", "N2O4+UDMH", "1966-AcT", "Media","Rusia","Jupiter", 26.0);
            case CODIGO_CURIOSIDAD:
                return new NaveRobotica("Curiosidad*****", "Es una misión espacial que incluye un astromóvil de exploración marciana dirigida por la NASA.", "Solido+liquido******", "2011-Act", "Minima","EE.UU","Marte", 22.44);
            case CODIGO_SKYLAB:
                return new NaveEspacialTripulada("Skylab", "Fue la primera estación espacial de los Estados Unidos.", "NO4+UDMH", "1973-1979", "Minima","EE.UU",77.0,435.0,3);
            case CODIGO_SALYUT:
                return new NaveEspacialTripulada("Salyut", "Fue la última estación espacial soviética adscrita al programa Saliut.", "NO+Amina", "1982-1991", "Minima","Rusia", 19.8,248.9,3);
            case CODIGO_EEI:
                return new NaveEspacialTripulada("Estacion Espacial Internacional", "Curso basico de back-end web y api rest", "N/A", "1998-Act", "Minima","EE.UU, Rusia, Japon, Canada, Europa",420.0,386.0,7);
            default:
                throw new NaveEspacialException("codigo invalido: " + codigo);
        }
    }
}