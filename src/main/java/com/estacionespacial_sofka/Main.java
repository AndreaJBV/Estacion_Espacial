package com.estacionespacial_sofka;

import com.estacionespacial_sofka.Controlador.View1Controlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Scanner;
import com.estacionespacial_sofka.Modelo.NaveEspacialFactory;
import com.estacionespacial_sofka.Modelo.NaveEspacial;
import com.estacionespacial_sofka.Modelo.NaveEspacialTripulada;
import com.estacionespacial_sofka.Modelo.NaveRobotica;
import com.estacionespacial_sofka.Modelo.VehiculoLanzadera;
import com.estacionespacial_sofka.Modelo.EstacionEspacialSofka;
import com.estacionespacial_sofka.Modelo.NaveEspacialFactory;
import com.estacionespacial_sofka.Modelo.NaveEspacialException;


public class Main extends Application {

    static Scanner scanner = new Scanner(System.in); //creacion de scanner para que se permita ingresar las opciones al usuario, se ubica ahi para que sea utilizabe en cualquien metodo
    static EstacionEspacialSofka estacionEspacialSofka = new EstacionEspacialSofka(); //creacion de la estacion espacial

    @Override
    public void start(Stage PrimerStage)  {//Cargar la ventana
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            System.out.println(getClass().getResource("../resources/View/View1.fxml"));
            fxmlLoader.setLocation(Main.class.getResource("/View/View1.fxml"));
            Pane ventana = (Pane) fxmlLoader.load();

            Scene scene = new Scene(ventana);
            PrimerStage.setScene(scene);
            PrimerStage.show();//Muestra la ventana

            View1Controlador controlador = fxmlLoader.getController();//Se le asigna el controlador a la vista
            controlador.setStage(PrimerStage);//envia la ventana que se va a inicializar es decir la 1
            PrimerStage.show();//Muestra la ventana

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] args) {
        launch();//Permite llamar la interfaz

        //CREACION DE MENÚ

        int opcion = 0;//Permite que el usuario elija la opcion

        do{ //Repita el menú mientas la opcion no sea a 3 que es salir
            System.out.println("--- BIENVENIDO A LA ESTACION ESPACIAL SOFKA ---");
            System.out.println("--- DONDE PONDREMOS A VOLAR TU IMAGINACION ---");
            System.out.println("Señor tripulante, por favor seleccione una opción: ");
            System.out.println("1. Crear naves espaciales.");
            System.out.println("2. Buscar informacion.");
            System.out.println("3. Salir.");
            opcion = scanner.nextInt();//Permite que el usuario elija la opcion
            switch (opcion){
                case 1:
                    creacionNaves();
                    break;
                case 2:
                    busquedaInformación();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("La opcion no es correcta");
            }
        }while (opcion!=3);
        System.out.println("Has salido de la ESTACION ESPACIAL SOFKA.");
        System.out.println("Hasta luego.");


    }

    static void creacionNaves() {
        //CREACION DE OBJETOS

        int codigo1 = 0;

        do{
            System.out.println("Elegir el código de la nave espacial a crear: ");
            System.out.println("1. CODIGO_SATURNO_V");
            System.out.println("2. CODIGO_ARAINE_V");
            System.out.println("3. CODIGO_LARGA_MARCHA_2F");
            System.out.println("4. CODIGO_ATV");
            System.out.println("5. CODIGO_LUNA_IX");
            System.out.println("6. CODIGO_CURIOSIDAD");
            System.out.println("7. CODIGO_SKYLAB");
            System.out.println("8. CODIGO_SALYUT");
            System.out.println("9. CODIGO_EEI");
            System.out.println("10. Volver al menú anterior");

            codigo1 = scanner.nextInt();//Permite que el usuario elija el codigo

            switch (codigo1){
                case 1:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_SATURNO_V);
                    System.out.println( "\n" +"Se creó la nave CODIGO_SATURNO_V" + "\n");
                    break;
                case 2:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_ARAINE_V);
                    System.out.println( "\n" + "Se creó la nave CODIGO_ARAINE_V" + "\n");
                    break;
                case 3:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_LARGA_MARCHA_2F);
                    System.out.println("\n"+ "Se creó la nave CODIGO_LARGA_MARCHA_2F" +  "\n");
                    break;
                case 4:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_ATV);
                    System.out.println( "\n" + "Se creó la nave CODIGO_ATV" + "\n");
                    break;
                case 5:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_LUNA_IX);
                    System.out.println( "\n" + "Se creó la nave CODIGO_LUNA_IX" + "\n");
                    break;
                case 6:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_CURIOSIDAD);
                    System.out.println( "\n"+ "Se creó la nave CODIGO_CURIOSIDAD" + "\n");
                    break;
                case 7:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_SKYLAB);
                    System.out.println( "\n" +"Se creó la nave CODIGO_SKYLAB" + "\n");
                    break;
                case 8:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_SALYUT);
                    System.out.println( "\n" +"Se creó la nave CODIGO_SALYUT" + "\n");
                    break;
                case 9:
                    estacionEspacialSofka.crearNaveEspacial(NaveEspacialFactory.CODIGO_EEI);
                    System.out.println( "\n"+ "Se creó la nave CODIGO_EEI" + "\n");
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Codigo incorrecto.");
            }
        }while (codigo1!=10);
    }

    static void busquedaInformación(){
        int codigo2 = 0;
        do{
            System.out.println("Seleccione por favor que desea consultar: ");
            System.out.println("1. Paises donde se originan las naves espaciales");
            System.out.println("2. Clasificación de las naves espaciales");
            System.out.println("3. Combustible que utilizan las naves espaciales");
            System.out.println("4. Funcionalidades Nave Vehiculo Lanzadera");
            System.out.println("5. Funcionalidades Nave Robotica");
            System.out.println("6. Funcionalidades Nave espacial Tripulada ");
            System.out.println("7. Volver al menú anterior");

            codigo2 = scanner.nextInt();//Permite que el usuario elija el codigo


            switch (codigo2){
                case 1:
                    //Conexion base de datos
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estacion_espacial_sofka","root","bedoya1234");
                        Statement statement = null;
                        statement = connection.createStatement();

                        ResultSet resultSet = statement.executeQuery("Select * from pais_de_origen;");
                        while (resultSet.next()){
                            System.out.println("Los paises de origen para las diferentes naves espaciales son: ");
                            System.out.println(resultSet.getString("pais"));

                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    //Conexion base de datos
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estacion_espacial_sofka","root","bedoya1234");
                        Statement statement = null;
                        statement = connection.createStatement();

                        ResultSet resultSet = statement.executeQuery("Select * from categoria_nave_espacial;");
                        while (resultSet.next()){
                            System.out.println("La clasificación de las naves espaciales son: ");
                            System.out.println(resultSet.getString("tipo"));

                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    //Conexion base de datos
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estacion_espacial_sofka","root","bedoya1234");
                        Statement statement = null;
                        statement = connection.createStatement();

                        ResultSet resultSet = statement.executeQuery("Select * from combustible;");
                        while (resultSet.next()){
                            System.out.println("Los combustible que utilizan las naves espaciales son: ");
                            System.out.println(resultSet.getString("descripcion"));

                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    //Polimorfismo
                    NaveEspacial nave1;
                    nave1 = new VehiculoLanzadera("Saturno V", "Cohete autopropulsado más potente jamás construido.", "Solido*+Queroseno+N(liq)", "1967-1973", "Alta","EE.UU",true);

                    System.out.println("Las funcionalidades de las naves espaciales Vehiculo lanzaderas es: " + "\n");
                    System.out.println("--FUNCIONALIDAD PRINCIPAL: " + "\n");
                    System.out.println(nave1.funcionalidadPrincipal() + "\n");
                    System.out.println("--FUNCIONALIDAD SECUNDARIA: " + "\n");
                    System.out.println(nave1.funcionalidadSecundaria() + "\n");
                    System.out.println("--FUNCIONALIDAD SECUNDARIA 2: " + "\n");
                    System.out.println(nave1.funcionalidadSecundaria(true) + "\n");
                    break;
                case 5:
                    //Polimorfismo
                    NaveEspacial nave2;
                    nave2 = new NaveRobotica("ATV***", "El lanzamiento de la primera de estas naves, llamada ATV-001 Julio Verne en honor del escritor francés, se realizó el día 9 de marzo de 2008.", "MMM**+NO", "2008-Act", "Alta","Europa","Saturno", 45.39);

                    System.out.println("Las funcionalidades de las naves espaciales Vehiculo lanzaderas es: " + "\n");
                    System.out.println("--FUNCIONALIDAD PRINCIPAL: " + "\n");
                    System.out.println(nave2.funcionalidadPrincipal() + "\n");
                    System.out.println("--FUNCIONALIDAD SECUNDARIA: " + "\n");
                    System.out.println(nave2.funcionalidadSecundaria() + "\n");
                    System.out.println("--FUNCIONALIDAD SECUNDARIA 2: " + "\n");
                    System.out.println(nave2.funcionalidadSecundaria( false) + "\n");
                    break;
                case 6:
                    //Polimorfismo
                    //NaveEspacial nave3;
                    nave2 = new NaveEspacialTripulada("Skylab", "Fue la primera estación espacial de los Estados Unidos.", "NO4+UDMH", "1973-1979", "Minima","EE.UU",77.0,435.0,3);
                    System.out.println("Las funcionalidades de las naves espaciales Vehiculo lanzaderas es: " + "\n");
                    System.out.println("--FUNCIONALIDAD PRINCIPAL: " + "\n");
                    System.out.println(nave2.funcionalidadPrincipal() + "\n");
                    System.out.println("--FUNCIONALIDAD SECUNDARIA: " + "\n");
                    System.out.println(nave2.funcionalidadSecundaria() + "\n");
                    System.out.println("--FUNCIONALIDAD SECUNDARIA: " + "\n");
                    System.out.println(nave2.funcionalidadSecundaria( true) + "\n");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Elección incorrecta");
            }
        }while (codigo2!=7);

    }

}