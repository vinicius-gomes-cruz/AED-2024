package libs;

import java.util.HashSet;
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
}
