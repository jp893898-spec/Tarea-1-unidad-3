public class GaussJordan {

    public static double[] resolver(double[][] matriz) {

        // Paso 1: Triangulación superior (vía Gauss)
        Gauss.eliminacionGaussiana(matriz);

        int n = matriz.length;

        // Paso 2: Normalización y eliminación hacia arriba
        for (int i = n - 1; i >= 0; i--) {

            // Normalizar el pivote a 1
            double pivote = matriz[i][i];
            for (int j = 0; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            // Eliminar coeficientes por encima de la diagonal
            for (int k = i - 1; k >= 0; k--) {
                double factor = matriz[k][i];
                for (int j = 0; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }

        // Paso 3: Obtener soluciones
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = matriz[i][n];
        }

        return x;
    }

    public static void imprimirMatriz(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == n) System.out.print("| ");
                System.out.printf("%8.4f ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}