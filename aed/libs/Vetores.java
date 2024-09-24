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

    public static int[] copiarTrechoVetor(int[] v, int a, int b){
        if (a > b) {
            return new int[0];
        }
        if (a > v.length && b > v.length) {
            return new int[0];
        }

        if (a < 0) {
            a = 0;
        }
        if (b > v.length) {
            b = v.length;
        }
        int[] vetor = new int[b - a];
        int l = 0;
        for (int i = a; i < b; i++) {
            if (i == v.length) {
                return vetor;
            }
            vetor[l] = v[i];
            l++;
        }
        return vetor;
    }
    public static double[] copiarTrechoVetor(double[] v, int a, int b){
        if (a > b) {
            return new double[0];
        }
        if (a > v.length && b > v.length) {
            return new double[0];
        }

        if (a < 0) {
            a = 0;
        }
        if (b > v.length) {
            b = v.length;
        }
        double[] vetor = new double[b - a];
        int l = 0;
        for (int i = a; i < b; i++) {
            if (i == v.length) {
                return vetor;
            }
            vetor[l] = v[i];
            l++;
        }
        return vetor;
    }
    public static boolean[] copiarTrechoVetor(boolean[] v, int a, int b){
        if (a > b) {
            return new boolean[0];
        }
        if (a > v.length && b > v.length) {
            return new boolean[0];
        }

        if (a < 0) {
            a = 0;
        }
        if (b > v.length) {
            b = v.length;
        }
        boolean[] vetor = new boolean[b - a];
        int l = 0;
        for (int i = a; i < b; i++) {
            if (i == v.length) {
                return vetor;
            }
            vetor[l] = v[i];
            l++;
        }
        return vetor;
    }

    public static int[] lerInteiros(int n) {
        Entrada.abrir();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerInt();
        }
        Entrada.fechar();
        return vetor;
    }

    public static double[] lerReais(int n) {
        Entrada.abrir();
        double[] vetor = new double[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerDouble();
        }
        Entrada.fechar();
        return vetor;
    }

    public static char[] lerCaracteres(int n) {
        Entrada.abrir();
        char[] vetor = new char[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerCaracteres();
        }
        Entrada.fechar();
        return vetor;
    }

    public static String[] lerString(int n) {
        Entrada.abrir();
        String[] vetor = new String[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = Entrada.lerPalavra();
        }
        Entrada.fechar();
        return vetor;
    }

}
