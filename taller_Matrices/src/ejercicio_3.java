import java.util.Scanner;
import java.util.Random;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] arregloMultidimensional = new int[filas][columnas];
        rellenaArray(arregloMultidimensional);

        // Calcular el tamaño del arreglo unidimensional
        int tamañoUnidimensional = filas * columnas;
        int[] arregloUnidimensional = new int[tamañoUnidimensional];

        // Copiar los números del arreglo multidimensional al arreglo unidimensional
        int contador = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arregloUnidimensional[contador] = arregloMultidimensional[i][j];
                contador++;
            }
        }

        // Mostrar el arreglo unidimensional
        System.out.println("Arreglo Unidimensional:");
        for (int num : arregloUnidimensional) {
            System.out.print(num + " ");
        }
    }

    public static void rellenaArray(int[][] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100); // Cambia el límite según tus necesidades
            }
        }
    }
}
