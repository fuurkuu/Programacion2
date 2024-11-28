/*
Implementar un método recursivo que reciba un número entero y devuelva la suma de sus dígitos. 	
 */
package Examen1ºEV;

public class Ejercicio005 {
    public static void main(String arg[]) { 
        int resultado = sumar(51);
        System.out.println("El resultado es " + resultado);
    }
    public static int sumar(int numero){
        if((numero%10) != 0){
            return sumar(numero/10 )+ numero; 
        }
        else 
           return numero;
    }
}
