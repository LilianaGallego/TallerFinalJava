package Clases;

import java.util.Scanner;

/**
 * Esta clase contiene los atributos y metodos de una calculadora

 * @author: Martha Liliana Gallego Murillo

 * @version: 1.0

 */
public class Calculadora {
    
   //Atributos de la clase
    private double resultado;
    
    //objeto lectura de tipo Scanner para capturar los numeros ingresados por consola
    Scanner lectura = new Scanner(System.in);
    
    //objeto entrada de tipo Scanner para capturar por consola el signo de la operacion que se desea realizar
    Scanner entrada = new Scanner(System.in);
    Menu menu1 = new Menu();
    
    /**
    * Metodo constructor vacio de la clase Calculadora, para crear obetos de este tipo
    */
    public Calculadora() {
    }
    
    /**
    * Metodo constructor  parametrizado
    * @param resultado es el resultado de la operacion realizada  en la calculadora segun sea el metodo (sumar, restar, multiplicar, dividir, modular)
    */
    public Calculadora(double resultado) {
        this.resultado = resultado;
    }
    
     /**
     * Metodo para regresar el resultado obtenido de la operacion
     * @return Regresa el resultado obtenido de la operacion
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * Establece el resultado de la operacion
     * @param resultado numero que se le asigna a resultado
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
   
    /**
     * Metodo para sumar dos numeros
     * @param numero1 numero de  tipo double para realizar la suma
     * @param numero2 numero de  tipo double para realizar la suma
     * @return devuelve el resultado de la suma
     */
    public double sumar(double numero1,double numero2){
        setResultado(0);
        this.setResultado(numero1 + numero2);
        
        return getResultado();
    }//cierre del metodo
    
    /**
     * Metodo para restar dos numeros
     * @param numero1 numero de  tipo double para realizar la resta
     * @param numero2 numero de  tipo double para realizar la resta
     * @return devuelve el resultado de la resta
     */
    public double restar(double numero1,double numero2){
        setResultado(0);//se inicializa resultado en cero
        this.setResultado(numero1 - numero2);
        
        return getResultado();
    }//cierre del metodo
    
    /**
     * Metodo para multiplicar dos numeros
     * @param numero1 numero de  tipo double para realizar la multiplicacio
     * @param numero2 numero de  tipo double para realizar la multiplicacio
     * @return devuelve el resultado de la multiplicacio
     */
    public double multiplicar(double numero1,double numero2){
        setResultado(0);//se inicializa resultado en cero
        this.setResultado(numero1 * numero2);
        
        return getResultado();
    }//cierre del metodo
    
    /**
     * Metodo para divir dos numeros
     * @param numero1 numero de  tipo double para realizar la division
     * @param numero2 numero de  tipo double para realizar la division
     * @return devuelve el resultado de la division
     */
    public double dividir(double numero1,double numero2){
        setResultado(0);//se inicializa resultado en cero
        
        //condicion si el divisor numero2 es diferente de cero
        if (numero2 != 0){
            this.setResultado(numero1 / numero2);
        }
        
        //ciclo que se repite mientras el divisor numero2 es igual a cero
        while (numero2 == 0 ){
                    System.out.println("No puede dividir entre 0, digite un numero diferente");
                    System.out.println("\nIngrese un numero\n");
                    numero2 = Double.parseDouble(lectura.nextLine());
                    if (numero2 != 0){
                        this.setResultado(numero1 / numero2);
                    }
        }
        return getResultado();
    }//cierre del metodo
    
    /**
     * Metodo para obtener el modulo de la division de dos numeros
     * @param numero1 numero de  tipo double para obtener el modulo de la division
     * @param numero2 numero de  tipo double para obtener el modulo de la division
     * @return devuelve el modulo de la division
     */
    public double modular(double numero1,double numero2){
        setResultado(0);//se inicializa resultado en cero
        this.setResultado(numero1 % numero2);
        
        return getResultado();
    }//cierre del metodo
    
    
    /**
     * Metodo ejecuta la operacion de la calculadora segun la eleccion realizada
     * @param signo caracter de  tipo String para elegir la operacion desea realizar
     * @param numero1 numero de  tipo double para realizar la operacion elegida
     * @param numero2 numero de  tipo double para realizar la operacion elegida
     * @return devuelve un boolean que modifica la variable menu para la ejecucion del ciclo en la clase main
     */
    public boolean operacion(String signo, double resultado, double numero2){
        // Se crea una bandera para controlar el ciclo de este metodo
        boolean bandera = true;
        while (bandera) {

            // se llama el metodo textoCondicion 
            textoCondicion();
            
            signo = entrada.nextLine().trim();

            if (signo.equals("+")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                resultado = sumar(resultado, numero2);//Se llama el metodo sumar y se almacena en resultado
                bandera =  true;// permite que el ciclo continue y se sigan realizando mas operaciones
            }

            if (signo.equals("-")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                resultado = restar(resultado, numero2);//Se llama el metodo restar y se almacena en resultado
                bandera =  true;// permite que el ciclo continue y se sigan realizando mas operaciones
            }
            
            if (signo.equals("*")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                resultado = multiplicar(resultado, numero2);//Se llama el metodo multiplicar y se almacena en resultado
                bandera =  true;// permite que el ciclo continue y se sigan realizando mas operaciones
            }
            
            if (signo.equals("/")){

                System.out.println("\nIngrese un numero\n");
                numero2= Double.parseDouble(lectura.nextLine());
                resultado = dividir(resultado, numero2);//Se llama el metodo dividir y se almacena en resultado
                bandera =  true;// permite que el ciclo continue y se sigan realizando mas operaciones
            }
            
            if (signo.equals("%")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                resultado = modular(resultado, numero2);//Se llama el metodo modular y se almacena en resultado
                bandera =  true;// permite que el ciclo continue y se sigan realizando mas operaciones
            }
            
            if (signo.equals("q") || signo.equals("Q")) {
                bandera = false;// hace que el ciclo se detenga porque se eligio salir ingresando por consola la letra q o Q
                return false;//retorna a la variable menu de la clase Main para que se salga del sistema       
             }

            bandera = true;// permite que el ciclo continue y se sigan realizando mas operaciones
        }return true;// permite que el ciclo de la clase Main continue y se sigan realizando mas operaciones
    }//cierre del metodo
    
    /**
     * Metodo para mostrar por consola el resultado de la operacion realizada
     * Llama el metodo menuOperacion de la clase Menu para que muestre por pantalla las opciones disponibles
     */
    public void textoCondicion(){
        System.out.println("Resultado: " + getResultado());
        menu1.menuOperacion();
        
    }//cierre del metodo
   
    
}//cierre de la clase calculadora
