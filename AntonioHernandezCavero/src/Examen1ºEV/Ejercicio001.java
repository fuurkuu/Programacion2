/*
Implementa una función que reciba un vector de 10 enteros y un número entero ‘n’ 
y devuelva un nuevo vector que contenga sólo los elementos del primer vector que sean mayores que ‘n’.
 */
package Examen1ºEV;

public class Ejercicio001 {
    public static void main(String arg[]){
        int n = 30;
        int vector[] = {23, 300, 48, 6, 3, 90, 35, 89, 123, 12};
        int resultado[] = resuelto(n, vector);
        
        for(int i = 0; i < resultado.length; i++)
        System.out.print(resultado[i] + " ");
    }
    public static int[] resuelto (int numero, int vector[]){
        int resultado[] = new int[10];
        int j = 0;
        for(int i = 0; i < vector.length; i++)
            if(vector[i] > numero){
                resultado[j] = vector[i];
                j++;
            }
        return resultado;
    }
}
