package Trabalho_2_bim;


public class Trabalho03 {
    public static void ex01(int[] vetor, char separador) {;
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

    // public static int[] ex07(int[] v1, int[] v2) {
        
    // }

    // public static int[] ex08(int[] v1, int[] v2) {

    // }

    public static int[] ex09(int[] v1, int[] v2) {
        boolean repetiu = false;
        int repetidos = 0;

        for (int i = 0; i < v1.length; i++) {
            
        }
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    repetiu = true;
                    continue;
                }
            }
            if (repetiu == false) {
                repetidos += 1;
            }
            repetiu = false;
        }

        int[] vetor = new int[v1.length - repetidos];
        int l = 0;
        repetiu = false;
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    repetiu = true;
                }
            }
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == v1[i]) {
                    repetiu = true;
                }
            }
            if (repetiu == false) {
                vetor[l] = v1[i];
                l++;
            }
            repetiu = false;
        }

        return vetor;
    }
}