public class ejercicio_2 {
    public static void main(String[] args) {
        int[][] arreglo = {
                {3, 5, 0},
                {4, 4, 0},
        };

        // Calculamos la suma y la almacenamos en la tercera columna
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i][2] = arreglo[i][0] + arreglo[i][1];
        }

        // Mostramos el arreglo con un solo bucle
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i][0] + " + " + arreglo[i][1] + " = " + arreglo[i][2]);
        }
    }
}
