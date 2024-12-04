/*
Implementar un método recursivo que reciba un número entero y devuelva la suma de sus dígitos. 	
 */
package Examen1ºEV;

public class Ejercicio005 {
    public static void main(String arg[]) { 
        
        System.out.println("El resultado es " + sumar(47));
    }
    public static int sumar(int numero){
        if(numero == 0)
            return 0;
        else 
           return sumar(numero/10)+ (numero%10); 
    }
}
