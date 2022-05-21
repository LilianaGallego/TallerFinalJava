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
public class Calculadora {
   
    double resultado;
    Scanner lectura = new Scanner(System.in);
    Scanner entrada = new Scanner(System.in);
    Menu menu1 = new Menu();
    public Calculadora() {
    }

    public Calculadora(double resultado) {
        this.resultado = resultado;
    }
   
    public double sumar(double numero1,double numero2){
        resultado = 0;
        this.resultado = numero1 + numero2;
        
        return resultado;
    }
    
    public double restar(double numero1,double numero2){
        resultado = 0;
        this.resultado = numero1 - numero2;
        
        return resultado;
    }
    
    public double multiplicar(double numero1,double numero2){
        resultado = 0;
        this.resultado = numero1 * numero2;
        
        return resultado;
    }
    
    public double dividir(double numero1,double numero2){
        resultado = 0;
        
        while (numero2 != 0){
            this.resultado = numero1 / numero2;
        }
        while (numero2 == 0 ){
                    System.out.println("No puede dividir entre 0, digite un numero diferente");
                    System.out.println("\nIngrese un numero\n");
                    numero2 = Double.parseDouble(lectura.nextLine());
                    if (numero2 != 0){
                        this.resultado = numero1 / numero2;
                    }
        }
        return resultado;
    }
    
    public double modular(double numero1,double numero2){
        resultado = 0;
        this.resultado = numero1 % numero2;
        
        return resultado;
    }
    
    

    public boolean operacion(String signo, double resultado, double numero2){
        
        boolean bandera = true;
        while (bandera) {

            
            textoCondicion();
            
            signo = entrada.nextLine().trim();

            if (signo.equals("+")){
                System.out.println("\nIngrese un numero\n");
                
                numero2 = Double.parseDouble(lectura.nextLine());
                resultado = sumar(resultado, numero2);
                bandera =  true;
            }

            if (signo.equals("-")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                System.out.println("Resultado: " + resultado);
                bandera =  true;
            }
            
            if (signo.equals("*")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                System.out.println("Resultado: " + resultado);
                bandera =  true;
            }
            
            if (signo.equals("/")){

                System.out.println("\nIngrese un numero\n");
                numero2= Double.parseDouble(lectura.nextLine());
                System.out.println("Resultado: " + resultado);
                bandera =  true;
            }
            
            if (signo.equals("%")){
                System.out.println("\nIngrese un numero\n");
                numero2 = Double.parseDouble(lectura.nextLine());
                System.out.println("Resultado: " + resultado);
                bandera =  true;
            }
            
            if (signo.equals("q") || signo.equals("Q")) {
                bandera = false;
                return false;           
             }

            bandera = true;
        }return true;
    }
    
    public void textoCondicion(){
        System.out.println("Resultado: " + resultado);
        menu1.menuOperacion();
        
    }
    
    
    
}
