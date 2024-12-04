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
        String sustituta = "";
        String posiciones = "La palabra ".concat(palabra).concat(" ha apareciodo en las posiciones : ");
        for( int i = 0; i < palabra.length(); i++)
            sustituta = sustituta.concat("*");
        int posicion = frase.indexOf(palabra);
        while(posicion != -1){
            posiciones = posiciones.concat(posicion + ", ");
            frase = frase.substring(0,posicion).concat(sustituta).concat(frase.substring(posicion + palabra.length()));
            posicion = frase.indexOf(palabra);
        }
        posiciones = posiciones.substring(0,posiciones.length()-2);
        System.out.printf("La frase queda %s \n", frase);
        System.out.println(posiciones);
    }
}
