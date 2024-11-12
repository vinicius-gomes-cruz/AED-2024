package libs;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Lista {
    public static void linkedList() {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(10);
        lista.add(20);
        lista.add(30);

        int x;

        for (int i = 0; i < lista.size(); i++) {
            x = lista.get(i);
            System.out.printf("[%d] %d\n", i, x);
        }

        System.out.println("----------------------");

        lista.add(3, 500);
        lista.add(5, 400);

        for(int i : lista) {
            System.out.printf("[%d] %d\n",lista.indexOf(i), i);
        }
    }

    public static void hashSet() {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);
        conjunto.add(40);
        conjunto.add(20);
        conjunto.add(50);

        for (Integer y : conjunto) {
            System.out.println(y);
        }

        System.out.println(conjunto.contains(30));
    }

    public static void hashTable() {
        Hashtable<String, Integer> tabela = new Hashtable<>();

        tabela.put("batata", 10);
        tabela.put("carne", 15);
        tabela.put("abacate", 3);

        for(String posicao : tabela.keySet()) {
            System.out.printf("[%s]\t%d\n",posicao, tabela.get(posicao));
        }
    }

    public static void separarPalavras() {
        String msg = "hoje e um dia apos ontem hoje tambem e um dia antes de amanha";
        String[] palavras = msg.split(" ");
        String palavra;

        Hashtable<String, Integer> contador = new Hashtable<>();

        for (int i = 0; i < palavras.length; i++) {
            palavra = palavras[i];

            if (contador.containsKey(palavra)) {
                contador.put(palavra, contador.get(palavra) + 1);
            } else {
                contador.put(palavra, 1);
            }
        }
        for(String posicao : contador.keySet()) {
            System.out.printf("[%s]\t%d\n",posicao, contador.get(posicao));
        }
    }

    public static void vetorEsparso() {
        System.out.println("Vetor esparso");

        int[] vetor = {0,0,0,0,0,0,0,0,0,0,50,60,0,0,0,0,90,50,0,0,0,0};

        Hashtable<Integer, Integer> vetor_esparso = new Hashtable<>();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                vetor_esparso.put(i, vetor[i]);
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.err.printf("[%d] - %d - %d\n", i, vetor[i], vetorEsp(vetor_esparso, i));
        }
    }

    public static int vetorEsp(Hashtable<Integer, Integer> vetor_esparso, int posicao) {
        if (vetor_esparso.containsKey(posicao)) {
            return vetor_esparso.get(posicao);
        }

        return 0;
    }
}
