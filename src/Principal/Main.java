/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Calculadora;
import Clases.Menu;
import java.util.Scanner;

/**
 *
 * @author palig
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculadora = new Calculadora();
        Menu menu1 = new Menu();
        Scanner lectura = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        boolean menu = true;

        while (menu) {
            menu1.bienvenida();
            int opcion = Integer.parseInt(lectura.nextLine());

            if (opcion == 1) {
                System.out.println("\nIngrese un numero");
                double resultado = Double.parseDouble(lectura.nextLine());
                menu1.menuOperacion();
                
                String signo = entrada.nextLine().trim();

                if (signo.equals("+")) {
                    System.out.println("\nIngrese un numero\n");
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    resultado = calculadora.sumar(resultado, numero2);
                    menu = calculadora.operacion(signo, resultado, numero2);
                }

                if (signo.equals("-")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    resultado = calculadora.restar(resultado, numero2);
                    menu = calculadora.operacion(signo, resultado, numero2);
                }

                if (signo.equals("*")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    resultado = calculadora.multiplicar(resultado, numero2);
                    menu = calculadora.operacion(signo, resultado, numero2);
                }

                if (signo.equals("/")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = lectura.nextDouble();
                    resultado = calculadora.dividir(resultado, numero2);
                    menu = calculadora.operacion(signo, resultado, numero2);
                }

                if (signo.equals("%")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    resultado = calculadora.modular(resultado, numero2);
                    menu = calculadora.operacion(signo, resultado, numero2);
                }
                if (!signo.equals("%")) {
                    
                }
                if (!signo.equals("+") || signo.equals("-") || !signo.equals("*") || !signo.equals("/") || !signo.equals("%") || !signo.equals("q") || !signo.equals("Q")){
                    System.out.println("\nElija una opcion correcta \n");
                    menu1.menuOperacion();
                    
                    signo = entrada.nextLine().trim();
                }
            }
            if (opcion == 2) {
                menu = false;
            }

            if (opcion != 1 && opcion != 2) {
                System.out.println("\nElija una opcion correcta (1 ó 2)\n");
                menu = true;
            }
        }
    }
}
