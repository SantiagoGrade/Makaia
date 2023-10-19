public class ejercicio_4 {
    public static void main(String[] args) {
        int[][] tabla = crearTablaMultiplicar(9);
        mostrarTablaMultiplicar(tabla);
    }

    public static int[][] crearTablaMultiplicar(int n) {
        int filas = n + 1; // Incluye la primera fila y columna para los números del 1 al 9
        int columnas = n + 1;
        int[][] tabla = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0) {
                    tabla[i][j] = j;
                } else if (j == 0) {
                    tabla[i][j] = i;
                } else {
                    tabla[i][j] = i * j;
                }
            }
        }

        return tabla;
    }

    public static void mostrarTablaMultiplicar(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
