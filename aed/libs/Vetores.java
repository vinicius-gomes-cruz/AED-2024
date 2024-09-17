package libs;

public class Vetores {
    public static int[] alocarInteiros(int n) {
        int[] vetor = new int[n];
        return vetor;
    }

    public static double[] alocarReais(int n) {
        double[] vetor = new double[n];
        return vetor;
    }

    public static boolean[] alocarLogicos(int n) {
        boolean[] vetor = new boolean[n];
        return vetor;
    }

    public static char[] alocarCaracteres(int n) {
        char[] vetor = new char[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = '\0';
        }
        return vetor;
    }

    public static String[] alocarCadeiasDeCaracteres(int n) {
        String[] vetor = new String[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = "";
        }
        return vetor;
    }

    public static int[] copiarInteiros(int[] v) {
        int[] vetor = new int[v.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = v[i];
        }
        return vetor;
    }

    public static double[] copiarReais(double[] v) {
        double[] vetor = new double[v.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = v[i];
        }
        return vetor;
    }

    public static boolean[] copiarLogicos(boolean[] v) {
        boolean[] vetor = new boolean[v.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = v[i];
        }
        return vetor;
    }

    public static char[] copiarCaracteres(char[] v) {
        char[] vetor = new char[v.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = v[i];
        }
        return vetor;
    }

    public static String[] copiarCadeiasDeCaracteres(String[] v) {
        String[] vetor = new String[v.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = v[i];
        }
        return vetor;
    }

}
