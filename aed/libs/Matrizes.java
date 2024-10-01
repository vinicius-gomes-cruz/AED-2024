package libs;

public class Matrizes {
    public static int[][] somaDeMatrizes(int[][] mA, int[][] mB) {
        int[][] matriz = new int[mA.length][mA[0].length];

        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[i].length; j++) {
                matriz[i][j] = mA[i][j] + mB[i][j];
            }
        }

        return matriz;
    }

    public static int[][] matrizIdentidade(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
        return matriz;
    }

    public static boolean compararMatrizes(int[][] mA, int[][] mB) {

        if (mA.length != mB.length) {
            return false;
        }

        for (int i = 0; i < mB.length; i++) {
            if (mA[i].length != mB[i].length) {
                return false;
            }
            for (int j = 0; j < mB[i].length; j++) {
                if (mA[i][j] != mB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] novaInt(int L, int C) {
        int[][] matriz = new int[L][C];

        return matriz;
    }

    public static int[][] preencherInt(int[][] m, int valor) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = valor;
            }
        }

        return m;
    }

    public static int[] matrizGetLinhaInt(int[][] matriz, int n) {
        return matriz[n];
    }

    public static int[] matrizGetColunaInt(int[][] matriz, int n) {
        int[] vetor = new int[matriz[0].length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = matriz[i][n];
        }

        return vetor;
    }

    public static int[][] matrizMultInt(int[][] mA, int[][] mB) {
        if (mA[0].length != mB.length) {
            return new int[0][0];
        }
        int[][] matriz = new int[mA.length][mB[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < mB[0].length; j++) {
                for (int j2 = 0; j2 < mA[0].length; j2++) {
                    matriz[i][j] += mA[i][j2] * mB[j2][j];
                }
            }
        }
        return matriz;
    }
}
