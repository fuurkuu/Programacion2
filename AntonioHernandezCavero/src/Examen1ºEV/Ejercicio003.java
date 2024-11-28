/*
Implementar un método al que se le pase una matriz de 3*3 de enteros y devuelva 
otra matriz de 3*3 con los valores de la matriz original rotados 90º.  
Tal y como veis en el ejemplo.  
El contenido de la matriz rotada debe mostrarse por pantalla.
1 -> 0,2
2-> 1,2
3-> 2,2

4 -> 0,1
5-> 1,1
6-> 2,1

7 -> 0,0
8-> 1,0
9-> 2,0
 */
package Examen1ºEV;

public class Ejercicio003 {
    public static void main(String arg[]){
        int vector[][] = {  {1, 2, 3}, 
                            {4, 5, 6},
                            {7, 8, 9}
                         };
        
        for(int i = vector.length-1; i >= 0; i--){
            System.out.println();
            for(int j = vector[i].length-1; j >= 0; j--)
                System.out.print(matriz(vector)[i][j] + " ");
        }
        
    }
    public static int[][] matriz (int vector[][]){
        int v[][] = new int [3][3];
        for(int i = vector.length-1; i >= 0; i--){
            for(int j = vector[i].length-1; j >= 0; j--)
                v[j][i] = vector[i][j];    
        }
        return v;
    }
}
