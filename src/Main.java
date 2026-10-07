public class Main {

    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("  MÉTODOS NUMÉRICOS - PRÁCTICA: MÉTODO DE GAUSS-JORDAN");
        System.out.println("====================================================\n");

        // Sistema de ecuaciones de prueba (3x3):
        //  2x1 +  x2 -  x3 =  8
        //  3x1 -  x2 + 2x3 = -1
        //  x1  + 2x2 + 3x3 =  5
        double[][] matriz = {
                {2,  1, -1,  8},
                {3, -1,  2, -1},
                {1,  2,  3,  5}
        };

        System.out.println("--- Matriz Aumentada Original ---");
        GaussJordan.imprimirMatriz(matriz);

        // Resolver por el método de Gauss-Jordan
        double[] solucion = GaussJordan.resolver(matriz);

        System.out.println("--- Matriz Reducida (Matriz Identidad) ---");
        GaussJordan.imprimirMatriz(matriz);

        System.out.println("--- Solución Directa del Sistema ---");
        for (int i = 0; i < solucion.length; i++) {
            System.out.printf("x%d = %8.4f\n", (i + 1), solucion[i]);
        }
    }
}