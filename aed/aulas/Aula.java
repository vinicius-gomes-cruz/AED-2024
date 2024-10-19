package aulas;

import libs.Vetores;
import trabalhos.T3;

public class Aula {
    public static void aula(){
        int[]vetor01 = {1,2,3,4,5,4,3,2,1};
        System.out.print("Exercicio 1: ");
        T3.ex01(vetor01, 'x');

        int[]vetor02 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Exercicio 2: ");
        Vetores.mostrarInt(T3.ex02(vetor02, 5));

        int[]vetor03 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Exercicio 3: ");
        Vetores.mostrarInt(T3.ex03(vetor03, 5));

        boolean[]vetor0401 = {true, false, true, false};
        boolean[]vetor0402 = {false, true, false, true};
        System.out.print("Exercicio 4:");
        Vetores.mostrarInt(T3.ex04(vetor0401, vetor0402));

        boolean[]vetor0501 = {true, false, true, false};
        boolean[]vetor0502 = {false, true, false, true};
        System.out.print("Exercicio 5:");
        Vetores.mostrarInt(T3.ex05(vetor0501, vetor0502));

        int[]vetor0601 = {1,2,3,4,5,6,7,8,9,10};
        boolean[]vetor0602 = {true, false, true, false, true, false, false, false, false, true};
        System.out.print("Exercicio 6:");
        Vetores.mostrarInt(T3.ex06(vetor0601, vetor0602));

        int[]vetor0701 = {2,3,4,5,6,7,8,9};
        int[]vetor0702 = {1,2,3,4,5,6,7,8,9};
        System.out.print("Exercicio 7:");
        Vetores.mostrarInt(T3.ex07(vetor0701, vetor0702));

        int[]vetor0801 = {1,2,3,4,5,6};
        int[]vetor0802 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Exercicio 8:");
        Vetores.mostrarInt(T3.ex08(vetor0801, vetor0802));

        int[]vetor0901 = {1,2,3,4,5};
        int[]vetor0902 = {1,2,6,7,8,9,10};
        System.out.print("Exercicio 9:");
        Vetores.mostrarInt(T3.ex09(vetor0901, vetor0902));

        int n = 6;
        System.out.println("Exercicio 10:");
        for (int i = 0; i < n; i++) {
            Vetores.mostrarInt(T3.ex10(n)[i]);
        }

        int[][] matriz11 = {{1,7,8},{5,3,2}};
        System.out.println("Exercicio 11:");
        for (int i = 0; i < matriz11[0].length; i++) {
            Vetores.mostrarInt(T3.ex11(matriz11)[i]);
        }

        int[][] matriz12 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Exercicio 12:");
        for (int i = 0; i < matriz12.length; i++) {
            Vetores.mostrarInt(T3.ex12(matriz12, 0,2)[i]);
        }
        
        int[][] matriz1301 = {{1,2,3},{4,5,6}};
        int[][] matriz1302 = {{0,1,2},{2,1,0},{1,2,3}};
        System.out.println("Exercicio 13:");
        for (int i = 0; i < matriz1301.length; i++) {
            Vetores.mostrarInt(T3.ex13(matriz1301,matriz1302)[i]);
        }

    }
}
