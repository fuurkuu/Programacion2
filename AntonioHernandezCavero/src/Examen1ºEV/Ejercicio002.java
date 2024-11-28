/*
Dado un String y una palabra específica, implementa un programa que busque 
todas las apariciones de la palabra en el String y la oculte con asteriscos. 
También deberá mostrar las posiciones en las que ha aparecido la palabra dentro del String.

 */
package Examen1ºEV;

public class Ejercicio002 {
    public static void main(String arg[]){
        String frase = "El sol brilla, porque el sol es brillante";
        String palabra = "sol";
        int inicio = 0;
        
        for(int i = inicio; i < frase.length(); i++)
            if(frase.substring(inicio+i) == " sol "){
                frase = frase.substring(inicio).concat("***").concat(frase.substring((inicio+2),frase.length()));
                inicio += 2;
            }
            else 
                inicio += i;
    }
}
