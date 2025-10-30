package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");
        //Dieseñar un algoritmo que permite el ingreso
        //de un usuario con correo y contraseña
        //Se permitiran 3 intentos antes de bloquearlo

        //Diseñar un algoritmo que permita mostrar un menú de opciones
        //Si el usuario se autentica con exito, el menu sera el siguiente:
        // 1. Resgitrar venta
        // 2. Mostrar ventas del día
        // 3. Salir
        //NOTA: Una venta se considera en el sistema como una variable
        //con los siguientes datos:
        //id --> entero
        //fecha --> LocalDate
        //descripcion --> Cadena
        //lista de productos -- > lista
        //total --> doble

        //NOTA2: un producto tiene:
        //id
        //precioUinitario
        //fotografia
        //cantidad

        //ENTRADAS DEL ALGORITMO 1
        Scanner leerTeclado=new Scanner(System.in);
        String colorVerde = "\u001B[32m";
        String colorNegro = "\u001B[30m";
        String colorRojo = "\u001B[31m";
        String colorAmarillo = "\u001B[33m";
        String colorAzul= "\u001B[34m";
        String colorMorado = "\u001B[35m";
        String colorBlanco = "\u001B[36m";


        //PROCESO
        System.out.println(colorAzul+"************************");
        System.out.println("GESTOR APP BY MILA 2025 🙌");
        System.out.println("************************");






    }
}