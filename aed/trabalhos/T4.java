package trabalhos;

import java.util.Hashtable;

import libs.Tempo;
import libs.Vetores;

public class T4 {
    public static void executar() {
        int[] tamanhos_vetor = { (int) 1e3, (int) 1e4, (int) 1e5, (int) 1e6 };
        Hashtable<Integer, Hashtable<String, Double>> tabela_tamanhos_vetores = new Hashtable<>();

        for (int i = 0; i < tamanhos_vetor.length; i++) {
            int tamanho = tamanhos_vetor[i];
            int[] vetor_aleatorio = obter_vetor(tamanho);
            int[] vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);
            Hashtable<String, Double> tabela_algoritmo_tempo = new Hashtable<>();

            System.out.println("Tamanho: " + tamanho);
            if (tamanho < 1e6) {
                System.out.println("Calculando bubble sort...");
                double tempo_bubble_sort = tempo_de_execucao_bubble_sort(vetor_copia);
                vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);
                tabela_algoritmo_tempo.put("Bubble sort", tempo_bubble_sort);

                System.out.println("Calculando insertion sort...");
                double tempo_insertion_sort = tempo_de_execucao_insertion_sort(vetor_copia);
                vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);
                tabela_algoritmo_tempo.put("Insertion sort", tempo_insertion_sort);

                System.out.println("Calculando selection sort...");
                vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);
                double tempo_selection_sort = tempo_de_execucao_selection_sort(vetor_copia);
                tabela_algoritmo_tempo.put("Selection sort", tempo_selection_sort);
            }

            System.out.println("Calculando merge sort...");
            vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);
            double tempo_merge_sort = tempo_de_execucao_merge_sort(vetor_copia);
            tabela_algoritmo_tempo.put("Merge sort", tempo_merge_sort);

            System.out.println("Calculando quick sort...");
            vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);
            double tempo_quick_sort = tempo_de_execucao_quick_sort(vetor_copia);
            tabela_algoritmo_tempo.put("Quick sort", tempo_quick_sort);

            System.out.println("Calculando counting sort...");
            vetor_copia = Vetores.copiarInteiros(vetor_aleatorio);

            tabela_tamanhos_vetores.put(tamanho, tabela_algoritmo_tempo);
            System.out.println();
        }

        System.out.println();
        exibir_dados(tamanhos_vetor, tabela_tamanhos_vetores);

    }

    public static int[] obter_vetor(int tamanho) {
        int[] vetor_aleatorio = Vetores.gerarValoresAleatorios(tamanho, 0, 1000000);
        return vetor_aleatorio;
    }

    public static double tempo_de_execucao_bubble_sort(int[] v) {
        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.bubbleSort(v);
        return Tempo.medirTempoFinalizarSegundos(tempo_inicio);
    }

    public static double tempo_de_execucao_insertion_sort(int[] v) {
        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.insertionSort(v);
        return Tempo.medirTempoFinalizarSegundos(tempo_inicio);
    }

    public static double tempo_de_execucao_selection_sort(int[] v) {
        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.selectionSort(v);
        return Tempo.medirTempoFinalizarSegundos(tempo_inicio);
    }

    public static double tempo_de_execucao_merge_sort(int[] v) {
        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.mergeSort(v);
        return Tempo.medirTempoFinalizarSegundos(tempo_inicio);
    }

    public static double tempo_de_execucao_quick_sort(int[] v) {
        long tempo_inicio = Tempo.medirTempoIniciar();
        Vetores.quickSort(v, 0, v.length);
        return Tempo.medirTempoFinalizarSegundos(tempo_inicio);
    }

    public static double tempo_de_execucao_counting_sort(int[] v) {
        long tempo_inicio = Tempo.medirTempoIniciar();
        return Tempo.medirTempoFinalizarSegundos(tempo_inicio);
    }

    public static void exibir_dados(int[] tamanhos_vetor, Hashtable<Integer, Hashtable<String, Double>> resultados) {
        for (int i = 0; i < tamanhos_vetor.length; i++) {
            int tamanho = tamanhos_vetor[i];
            System.out.printf("Com tamanho %d:\n", tamanho);

            Hashtable<String, Double> objeto = resultados.get(tamanho);

            System.out.printf("%-14s| Tempo(s)\n", "Algoritmo");
            System.out.println("-------------------------");

            for (String alg : objeto.keySet()) {
                System.out.printf("%-14s: %f\n", alg, objeto.get(alg));
            }

            System.out.println("----------------------------------------------");
            System.out.println();
        }
        ;
    }
}
