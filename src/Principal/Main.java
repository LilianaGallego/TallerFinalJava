package Principal;

import Clases.Calculadora;
import Clases.Menu;
import java.util.Scanner;

/*
 * Esta clase contiene el metodo main para ejecutar por consola los metodos de las otras clases

 * @author: Martha Liliana Gallego Murillo

 * @version: 1.0

 */
public class Main {

    /**
     * Metodo Principal que ejecuta los metodos de la clase Calculadora y menu e imprime por consola
     * @param args argumentos de consola del metodo main
     */
    public static void main(String[] args) {
        // Se crea un objeto de la clase Calculadora para acceder a sus metodos
        Calculadora calculadora = new Calculadora();
        // Se crea un objeto de la clase Menu para acceder a sus metodos
        Menu menu1 = new Menu();
        // Se crea un objeto lectura de la clase Scanner para acceder a sus metodos
        Scanner lectura = new Scanner(System.in);
        // Se crea un objeto entrada de la clase Scanner para acceder a sus metodos
        Scanner entrada = new Scanner(System.in);

        // Variable menu de tipo boolean para controlar el ciclo del programa
        boolean menu = true;

        while (menu) {
           // se llama el metodo bienvenida de la clase Menu con el objeto menu1
            menu1.bienvenida();
            
            //Se define la variable para capturar la entrada por consola
            int opcion = Integer.parseInt(lectura.nextLine());
            
            // Si la opcion es 1 se realizan las operaciones
            if (opcion == 1) {
                //captura por pantalla de un numero que se almacenara en la variable resultado
                System.out.println("\nIngrese un numero");
                double resultado = Double.parseDouble(lectura.nextLine());
                
                //se llama el metodo menuOperacion de la clase Menu
                menu1.menuOperacion();
                
                // Se lee la entrada por consola del signo de la operacion a realizar
                String signo = entrada.nextLine().trim();
                
                //si el signo es "+" ingresa y realiza la suma
                if (signo.equals("+")) {
                    System.out.println("\nIngrese un numero\n");
                    //captura por pantalla del numero2
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    
                    // se guarda el valor que retorna el metodo sumar en la variable resultado
                    resultado = calculadora.sumar(resultado, numero2);
                    
                    // se llama el metodo operacion de la clase Calculadora y el valor que retorna se guarda en la variable menu
                    //la cual controla el flujo del ciclo
                    menu = calculadora.operacion(signo, resultado, numero2);
                }
                
                //si el signo es "-" ingresa y realiza la resta
                if (signo.equals("-")) {

                    System.out.println("\nIngrese un numero\n");
                    //captura por pantalla del numero2
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    
                    // se guarda el valor que retorna el metodo restar en la variable resultado
                    resultado = calculadora.restar(resultado, numero2);
                    
                    // se llama el metodo operacion de la clase Calculadora y el valor que retorna se guarda en la variable menu
                    //la cual controla el flujo del ciclo
                    menu = calculadora.operacion(signo, resultado, numero2);
                }
                
                //si el signo es "*" ingresa y realiza la multiplicacion
                if (signo.equals("*")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    resultado = calculadora.multiplicar(resultado, numero2);
                    menu = calculadora.operacion(signo, resultado, numero2);
                }
                
                //si el signo es "/" ingresa y realiza la division
                if (signo.equals("/")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = lectura.nextDouble();
                    resultado = calculadora.dividir(resultado, numero2);
                    
                    // se llama el metodo operacion de la clase Calculadora y el valor que retorna se guarda en la variable menu
                    //la cual controla el flujo del ciclo
                    menu = calculadora.operacion(signo, resultado, numero2);
                }
                
                //si el signo es "%" ingresa y devuelve el modulo de la division
                if (signo.equals("%")) {

                    System.out.println("\nIngrese un numero\n");
                    double numero2 = Double.parseDouble(lectura.nextLine());
                    resultado = calculadora.modular(resultado, numero2);
                    
                    // se llama el metodo operacion de la clase Calculadora y el valor que retorna se guarda en la variable menu
                    //la cual controla el flujo del ciclo
                    menu = calculadora.operacion(signo, resultado, numero2);
                }
                
                //si el signo es diferente a "*", "-", "*", "/" o "%" ingresa y solicita que se escoja una opcion correcta
                
                if (!signo.equals("+") || signo.equals("-") || !signo.equals("*") || !signo.equals("/") || !signo.equals("%") || !signo.equals("q") || !signo.equals("Q")){
                    System.out.println("\nElija una opcion correcta \n");
                    // se llama el metodo menuOperacion de la clase Menu y el valor que retorna se guarda en la variable menu
                    //la cual controla el flujo del ciclo
                    menu1.menuOperacion();
                    // entrada por consola del signo de la operacion elegida
                    signo = entrada.nextLine().trim();
                }
            }
            
            // si la opcion es 2 se detiene el programa
            if (opcion == 2) {
                // variable que al asignarle false detiene el ciclo del programa
                menu = false;
            }
            
            // si la opcion es diferente de 1 y 2 ingresa y se le solicita que elija una opcion correcta
            if (opcion != 1 && opcion != 2) {
                System.out.println("\nElija una opcion correcta (1 ó 2)\n");
                //variable que al asignarle true permite que el ciclo continue y vuelva al menu inicial
                menu = true;
            }
        }
    }
}
