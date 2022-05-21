/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author palig
 */
public class Menu {
    Scanner lectura = new Scanner(System.in);

    public void bienvenida() {

        System.out.println("CALCULADORA ACUMULATIVA");
        System.out.println("---------------------------------------------");

        System.out.println("Por favor elija la opcion de menú que desea");
        System.out.println("1. Realizar una operación");
        System.out.println("2. Salir del sistema");

    }
    
    public void menuOperacion(){
        System.out.println("\nEstas son las operaciones disponibles");
        System.out.println("|OPERACION  | SIGNO|");
        System.out.println("|------------------|");
        System.out.println("|   Sumar   |  +   |");
        System.out.println("|------------------|");
        System.out.println("|   Restar  |  -   |");
        System.out.println("|------------------|");
        System.out.println("|Multiplicar|  *   |");
        System.out.println("|------------------|");
        System.out.println("|  Dividir  |  /   |");
        System.out.println("|------------------|");
        System.out.println("|  Modulo   |  %   |");
        System.out.println("|------------------|");
        System.out.println("\nEscriba el signo de la operacion que desea realizar o q para salir");
    }
}
