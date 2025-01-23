import java.util.Scanner;

    public class ProgramaComplejidadCiclomatica5 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Inicio del programa");
    
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
    
            int resultado = calcularResultado(numero);
    
            System.out.println("El resultado es: " + resultado);
    
            System.out.println("Fin del programa");
        }
    
        private static int calcularResultado(int n) {
            int resultado = 0;
    
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    resultado += i;
                } else {
                    resultado -= i;
                }
            }
    
            while (resultado < 100) {
                resultado *= 2;
            }
    
            if (resultado > 200) {
                resultado = 200;
            }
    
            return resultado;
        }
    }
