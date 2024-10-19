package trabalhos;

import libs.Vetores;

public class T3 {
    public static void ex01(int[] vetor, char separador) {
        ;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i != vetor.length - 1) {
                System.out.print(separador);
            }
        }
        System.out.println();
    }

    public static int[] ex02(int[] vetor, int valor) {
        int numeros = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                numeros += 1;
            }
        }

        int[] v = new int[numeros];

        int l = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > valor) {
                v[l] = vetor[i];
                l++;
            }
        }

        return v;
    }

    public static int[] ex03(int[] vetor, int valor) {
        int numeros = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < valor) {
                numeros += 1;
            }
        }

        int[] v = new int[numeros];

        int l = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < valor) {
                v[l] = vetor[i];
                l++;
            }
        }

        return v;
    }

    public static boolean[] ex04(boolean[] v, boolean[] w) {
        boolean[] vetor = new boolean[v.length];
        for (int i = 0; i < w.length; i++) {
            vetor[i] = v[i] && w[i];
        }

        return vetor;
    }

    public static boolean[] ex05(boolean[] v, boolean[] w) {
        boolean[] vetor = new boolean[v.length];
        for (int i = 0; i < w.length; i++) {
            vetor[i] = v[i] || w[i];
        }

        return vetor;
    }

    public static int[] ex06(int[] v, boolean[] mascara) {
        int verdadeiros = 0;
        for (int i = 0; i < mascara.length; i++) {
            if (mascara[i] == true) {
                verdadeiros += 1;
            }
        }

        int[] vetor = new int[verdadeiros];
        int l = 0;
        for (int i = 0; i < v.length; i++) {
            if (mascara[i] == true) {
                vetor[l] = v[i];
                l++;
            }
        }
        return vetor;
    }

    public static int[] ex07(int[] v1, int[] v2) {
        int[] vetor = new int[v1.length + v2.length];
        int[] vetor2 = new int[0];
        int j = 0;
        for (; j < v1.length; j++) {
            vetor[j] = v1[j];
        }
        for (int i = 0; i < v2.length; i++) {
            vetor[j] = v2[i];
            j++;
        }

        vetor2 = Vetores.removerRepeticao(vetor);
        return vetor2;
    }

    public static int[] ex08(int[] v1, int[] v2) {
        int[] vetor1 = new int[0];
        int[] vetor2 = new int[0];
        int numero = 0;

        for (int j = 0; j < v1.length; j++) {
            numero = v1[j];
            for (int i = 0; i < v2.length; i++) {
                if (v1[j] == v2[i]) {
                    int[] vetorsave = new int[vetor1.length];
                    for (int k = 0; k < vetor1.length; k++) {
                        vetorsave[k] = vetor1[k];
                    }
                    vetor1 = new int[vetorsave.length + 1];
                    for (int k = 0; k < vetorsave.length; k++) {
                        vetor1[k] = vetorsave[k];
                    }
                    vetor1[vetor1.length - 1] = numero;
                }
            }
        }

        vetor2 = Vetores.removerRepeticao(vetor1);

        return vetor2;
    }

    public static int[] ex09(int[] v1, int[] v2) {
        int[] vetor1 = new int[0];
        int[] vetor2 = new int[0];
        int numero = 0;
        boolean repetido = false;

        for (int j = 0; j < v1.length; j++) {
            numero = v1[j];
            for (int i = 0; i < v2.length; i++) {
                if (v1[j] == v2[i]) {
                    repetido = true;
                    continue;
                }
            }

            if (repetido == false) {
                int[] vetorsave = new int[vetor1.length];
                for (int k = 0; k < vetor1.length; k++) {
                    vetorsave[k] = vetor1[k];
                }
                vetor1 = new int[vetorsave.length + 1];
                for (int k = 0; k < vetorsave.length; k++) {
                    vetor1[k] = vetorsave[k];
                }
                vetor1[vetor1.length - 1] = numero;
            }
            repetido = false;
        }

        vetor2 = Vetores.removerRepeticao(vetor1);

        return vetor2;
    }

    public static int[][] ex10(int n) {
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < j) {
                    matriz[i][j] = 0;
                } else {
                    if (i == 0 || j == 0) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = matriz[i-1][j] + matriz[i-1][j-1];
                    }
                }
            }
            
        }
        return matriz;
    }

    public static int[][] ex11(int[][]matriz){
        int[][] matriz2 = new int[matriz[0].length][matriz.length];



        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = matriz[j][i];
            }
        }
        return matriz2;
    }

    public static int[][] ex12(int[][] matriz, int l1, int l2) {
        int[][] matriz2 = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == l1) {
                    matriz2[i] = matriz[l2];
                } else if (i == l2) {
                    matriz2[i] = matriz[l1];
                } else {
                    matriz2[i] = matriz[i];
                }
            }
        }
        
        return matriz2;
    }

    public static int[][] ex13(int[][] matriz, int[][] matriz2) {
        if (matriz[0].length != matriz2.length) {
            return new int[0][0];
        }
        int[][] matrizMult = new int[matriz.length][matriz2[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int j2 = 0; j2 < matriz[0].length; j2++) {
                    matrizMult[i][j] += matriz[i][j2] * matriz2[j2][j];
                }
            }
        }
        return matrizMult;
    }
}