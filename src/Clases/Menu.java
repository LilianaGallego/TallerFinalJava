package Clases;

import java.util.Scanner;

/**
 * Esta clase contiene los atributos y metodos de un Menu

 * @author: Martha Liliana Gallego Murillo

 * @version: 1.0

 */
public class Menu {
    // Se crea un objeto lectura de la clase Scanner para acceder a sus metodos
    Scanner lectura = new Scanner(System.in);
    
    /**
     * Metodo para mostrar  por consola el menu inicial del programa
     */
    public void bienvenida() {

        System.out.println("CALCULADORA ACUMULATIVA");
        System.out.println("---------------------------------------------");

        System.out.println("Por favor elija la opcion de menú que desea");
        System.out.println("1. Realizar una operación");
        System.out.println("2. Salir del sistema");

    }
    
    /**
     * Metodo para mostrar por consola las operaciones disponibles del programa
     */
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
