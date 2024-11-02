package libs;

import java.util.Random;
import java.util.Arrays;

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

    public static int[] copiarTrechoVetor(int[] v, int a, int b) {
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

    public static double[] copiarTrechoVetor(double[] v, int a, int b) {
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

    public static boolean[] copiarTrechoVetor(boolean[] v, int a, int b) {
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

    public static int obterPosicaoInteiro(int[] vetor, int valor_buscar, int pos_inicial) {
        int retorno = -1;

        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                retorno = i;
                return retorno;
            }
        }

        return retorno;
    }

    public static int obterPosicaoReal(double[] vetor, double valor_buscar, int pos_inicial) {
        int retorno = -1;

        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                retorno = i;
                return retorno;
            }
        }

        return retorno;
    }

    public static int obterPosicaoLogico(boolean[] vetor, boolean valor_buscar, int pos_inicial) {
        int retorno = -1;

        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                retorno = i;
                return retorno;
            }
        }

        return retorno;
    }

    public static int obterPosicaoCaracter(char[] vetor, char valor_buscar, int pos_inicial) {
        int retorno = -1;

        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                retorno = i;
                return retorno;
            }
        }

        return retorno;
    }

    public static int obterPosicaoCadeiaDeCaracteres(String[] vetor, String valor_buscar, int pos_inicial) {
        int retorno = -1;

        for (int i = pos_inicial; i < vetor.length; i++) {
            if (vetor[i] == valor_buscar) {
                retorno = i;
                return retorno;
            }
        }

        return retorno;
    }

    public static int[] obterIndices(int[] v, int valor_buscar) {
        int n = 0;
        int l = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                n++;
            }
        }
        int[] retorno = new int[n];

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                retorno[l] = i;
                l++;
            }
        }

        return retorno;
    }

    public static int[] obterIndices(double[] v, double valor_buscar) {
        int n = 0;
        int l = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                n++;
            }
        }
        int[] retorno = new int[n];

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                retorno[l] = i;
                l++;
            }
        }

        return retorno;
    }

    public static int[] obterIndices(boolean[] v, boolean valor_buscar) {
        int n = 0;
        int l = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                n++;
            }
        }
        int[] retorno = new int[n];

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                retorno[l] = i;
                l++;
            }
        }

        return retorno;
    }

    public static int[] obterIndices(String[] v, String valor_buscar) {
        int n = 0;
        int l = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                n++;
            }
        }
        int[] retorno = new int[n];

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                retorno[l] = i;
                l++;
            }
        }

        return retorno;
    }

    public static int[] obterIndices(char[] v, char valor_buscar) {
        int n = 0;
        int l = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                n++;
            }
        }
        int[] retorno = new int[n];

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor_buscar) {
                retorno[l] = i;
                l++;
            }
        }

        return retorno;
    }

    public static int[] removerRepeticao(int[] vetor) {
        int valor = 0;
        int num = 0;
        int qtdnum = 0;
        int l = 0;

        for (int i = 0; i < vetor.length; i++) {
            valor = vetor[i];
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] == valor) {
                    num++;
                }
            }
            if (num == 1) {
                qtdnum += 1;
            }
            num = 0;
        }

        int[] v = new int[qtdnum];

        for (int i = 0; i < vetor.length; i++) {
            boolean numex = false;
            valor = vetor[i];
            for (int j = 0; j < v.length; j++) {
                if (vetor[i] == v[j]) {
                    numex = true;
                }
            }
            if (numex == false) {
                v[l] = vetor[i];
                l++;
            }
        }

        return v;
    }

    public static void mostrarInt(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.print(vetor[i]);
            } else {
                System.out.print(vetor[i] + ", ");
            }

        }
        System.out.println("]");
    }

    public static void mostrarInt(boolean[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.print(vetor[i]);
            } else {
                System.out.print(vetor[i] + ", ");
            }

        }
        System.out.println("]");
    }

    public static void mostrarInt(double[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            if (i == vetor.length - 1) {
                System.out.print(vetor[i]);
            } else {
                System.out.print(vetor[i] + ", ");
            }

        }
        System.out.println("]");
    }

    public static int[] tirarRepeticoes(int[] vetor) {
        int[] vetor2 = new int[0];
        int numero = 0;
        boolean repetido = false;
        for (int i = 0; i < vetor.length; i++) {
            numero = vetor[i];
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor2[j] == numero) {
                    repetido = true;
                    continue;
                }
            }
            if (repetido == false) {
                int[] vetorsave = new int[vetor2.length];
                for (int k = 0; k < vetor2.length; k++) {
                    vetorsave[k] = vetor2[k];
                }
                vetor2 = new int[vetorsave.length + 1];
                for (int k = 0; k < vetorsave.length; k++) {
                    vetor2[k] = vetorsave[k];
                }
                vetor2[vetor2.length - 1] = numero;
            }
            repetido = false;

        }
        return vetor2;
    }

    public static int buscaSequencial(int[] v, int x) {

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int[] gerarValoresAleatorios(int n, int valor_min, int valor_max) {
        Random random = new Random();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            // Gera um número aleatório entre min (inclusivo) e max (inclusivo),
            // e salva na posição i do vetor
            vetor[i] = random.nextInt(valor_max - valor_min + 1) + valor_min;
        }

        return vetor;
    }

    public static int buscaBinaria(int[] v, int x) {
        int ini, meio, fim;

        ini = 0;
        fim = v.length;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (v[meio] == x) {
                return meio;
            } else {
                if (x < v[meio]) {
                    fim = meio - 1;
                } else {
                    ini = meio + 1;
                }
            }
        }

        return 0;
    }

    public static int[] gerarValoresAleatoriosOrdenado(int n, int valor_min, int valor_max) {

        // Obtém um vetor de valores aleatórios
        int[] vetor = gerarValoresAleatorios(n, valor_min, valor_max);

        // Ordena o vetor antes de retornar
        Arrays.sort(vetor);

        return vetor;
    }
}
