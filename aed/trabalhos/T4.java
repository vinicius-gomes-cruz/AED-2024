package trabalhos;

import java.util.LinkedHashMap;
import java.util.Map;

import libs.Tempo;
import libs.Vetores;

public class T4 {
    public static void executar() {
        int[] tamanhosVetor = { (int) 1e2, (int) 1e4,};
        Map<Integer, Map<String, Double>> resultados = new LinkedHashMap<>();

        for (int tamanho : tamanhosVetor) {
            System.out.println("Tamanho: " + tamanho);
            int[] vetorOriginal = obterVetor(tamanho);

            Map<String, Double> tempos = new LinkedHashMap<>();

            if (tamanho < 1e8) {
                medirETempo("Bubble sort", tempos, vetorOriginal, Vetores::bubbleSort);
                medirETempo("Insertion sort", tempos, vetorOriginal, Vetores::insertionSort);
                medirETempo("Selection sort", tempos, vetorOriginal, Vetores::selectionSort);
            }

            medirETempo("Merge sort", tempos, vetorOriginal, Vetores::mergeSort);
            medirETempo("Quick sort", tempos, vetorOriginal, v -> Vetores.quickSort(v, 0, v.length));
            medirETempo("Counting sort", tempos, vetorOriginal, T4::countingSort);
            medirETempo("Radix sort", tempos, vetorOriginal, T4::radixSort);

            resultados.put(tamanho, tempos);
            System.out.println();
        }

        exibirResultados(tamanhosVetor, resultados);
    }

    private static int[] obterVetor(int tamanho) {
        return Vetores.gerarValoresAleatorios(tamanho, 0, 1000000);
    }

    private static void medirETempo(String nome, Map<String, Double> tempos, int[] vetorOriginal, Algoritmo algoritmo) {
        int[] copiaVetor = Vetores.copiarInteiros(vetorOriginal);
        System.out.println("Calculando " + nome + "...");
        long inicio = Tempo.medirTempoIniciar();
        algoritmo.executar(copiaVetor);
        double tempo = Tempo.medirTempoFinalizarSegundos(inicio);
        tempos.put(nome, tempo);
    }

    public static void countingSort(int[] v) {
        int max = encontrarMax(v);
        int[] count = new int[max + 1];
        int[] output = new int[v.length];

        for (int num : v) {
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = v.length - 1; i >= 0; i--) {
            output[--count[v[i]]] = v[i];
        }

        System.arraycopy(output, 0, v, 0, v.length);
    }

    public static void radixSort(int[] v) {
        int max = encontrarMax(v);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortForRadix(v, exp);
        }
    }

    private static void countingSortForRadix(int[] v, int exp) {
        int[] count = new int[10];
        int[] output = new int[v.length];

        for (int num : v) {
            count[(num / exp) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = v.length - 1; i >= 0; i--) {
            output[--count[(v[i] / exp) % 10]] = v[i];
        }

        System.arraycopy(output, 0, v, 0, v.length);
    }

    private static int encontrarMax(int[] v) {
        int max = v[0];
        for (int num : v) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static void exibirResultados(int[] tamanhosVetor, Map<Integer, Map<String, Double>> resultados) {
        for (int tamanho : tamanhosVetor) {
            System.out.printf("Resultados para tamanho %d:\n", tamanho);

            Map<String, Double> tempos = resultados.get(tamanho);
            System.out.printf("%-14s| Tempo(s)\n", "Algoritmo");
            System.out.println("");

            for (Map.Entry<String, Double> entrada : tempos.entrySet()) {
                System.out.printf("%-14s: %f\n", entrada.getKey(), entrada.getValue());
            }

            System.out.println("");
            System.out.println();
        }
    }

    @FunctionalInterface
    interface Algoritmo {
        void executar(int[] v);
    }
}
