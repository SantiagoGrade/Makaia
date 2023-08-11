import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String romano = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero en mayusculas a convertir");
        romano = scanner.nextLine();
        int numeroNormal = convertir(romano);
        System.out.println("El número arábigo equivalente de " + romano + " es: " + numeroNormal);
    }

    public static int convertir(String numeroRomanos) {
        Map<Character, Integer> romanos = new HashMap<>();
        romanos.put('I', 1);
        romanos.put('V', 5);
        romanos.put('X', 10);
        romanos.put('L', 50);
        romanos.put('C', 100);
        romanos.put('D', 500);
        romanos.put('M', 1000);

        int resultado = 0;
        int previo = 0;

        for (int i = numeroRomanos.length() - 1; i >= 0; i--) {
            char separarado = numeroRomanos.charAt(i);
            int siguiente = romanos.get(separarado);

            if (siguiente < previo) {
                resultado -= siguiente;
            } else {
                resultado += siguiente;
            }

            previo = siguiente;
        }

        return resultado;
    }
}