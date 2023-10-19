import java.util.Random;

public class ejercicio_5 {
    public static void main(String[] args) {
        double[][] calendarioTemperaturas = new double[5][7];
        temperaturas(calendarioTemperaturas);

        System.out.println("Calendario de temperaturas:");
        mostrarMatriz(calendarioTemperaturas);

        calculos(calendarioTemperaturas);
    }

    public static void temperaturas(double[][] matriz) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(32) + 7;
            }
        }
    }

    public static void mostrarMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void calculos(double[][] matriz) {
        int temperaMaxDia = 0;
        int temperaMinDia = 0;
        double temperaMaxSemana = Integer.MIN_VALUE;
        double temperaMinSemana = Integer.MAX_VALUE;
        double sumaTemperaSemana = 0;

        for (int semana = 0; semana < matriz.length; semana++) {
            for (int dia = 0; dia < matriz[semana].length; dia++) {
                double temperatura = matriz[semana][dia];
                sumaTemperaSemana += temperatura;

                if (temperatura > temperaMaxSemana) {
                    temperaMaxSemana = temperatura;
                    temperaMaxDia = dia;
                }

                if (temperatura < temperaMinSemana) {
                    temperaMinSemana = temperatura;
                    temperaMinDia = dia;
                }
            }
        }

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("\nEstadísticas de la semana:");
        System.out.println("Temperatura máxima: " + temperaMaxSemana + "°C (Día: " + diasSemana[temperaMaxDia] + ")");
        System.out.println("Temperatura mínima: " + temperaMinSemana + "°C (Día: " + diasSemana[temperaMinDia] + ")");
        System.out.println("Promedio de temperatura: " + (double) sumaTemperaSemana / (5 * 7) + "°C");
    }
}
