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
            medirETempo("Counting sort", tempos, vetorOriginal, Vetores::countingSort2);
            medirETempo("Radix sort", tempos, vetorOriginal, Vetores::radixSort);

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
