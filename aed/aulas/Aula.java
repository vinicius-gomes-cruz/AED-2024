package aulas;

import java.util.Arrays;

import Trabalho_2_bim.Trabalho03;
import libs.Arquivos;
import libs.Entrada;
import libs.Exercicios;
import libs.Matrizes;
import libs.Vetores;

public class Aula {
    public static void aula(){
        int[]vetor01 = {1,2,3,4,5,4,3,2,1};
        System.out.print("Exercicio 1: ");
        Trabalho03.ex01(vetor01, 'x');

        int[]vetor02 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Exercicio 2: " + Arrays.toString(Trabalho03.ex02(vetor02, 5)));

        int[]vetor03 = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Exercicio 3: ");
        System.out.println(Arrays.toString(Trabalho03.ex03(vetor03, 5)));

        boolean[]vetor0401 = {true, false, true, false};
        boolean[]vetor0402 = {false, true, false, true};
        System.out.print("Exercicio 4:");
        System.out.println(Arrays.toString(Trabalho03.ex04(vetor0401, vetor0402)));

        boolean[]vetor0501 = {true, false, true, false};
        boolean[]vetor0502 = {false, true, false, true};
        System.out.print("Exercicio 5:");
        System.out.println(Arrays.toString(Trabalho03.ex05(vetor0501, vetor0502)));

        int[]vetor0601 = {1,2,3,4,5,6,7,8,9,10};
        boolean[]vetor0602 = {true, false, true, false, true, false, false, false, false, true};
        System.out.print("Exercicio 6:");
        System.out.println(Arrays.toString(Trabalho03.ex06(vetor0601, vetor0602)));

        int[]vetor0901 = {10, 1, 7, 2, 3, 4, 5, 3, 6, 7};
        int[]vetor0902 = {5, 6, 7, 8, 9, 10};
        System.out.print("Exercicio 9:");
        System.out.println(Arrays.toString(Trabalho03.ex09(vetor0901, vetor0902)));

    }
}
