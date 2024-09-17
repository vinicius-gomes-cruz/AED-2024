package aulas;

import java.util.Arrays;

import libs.Entrada;
import libs.Exercicios;
import libs.Vetores;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        int[] v = {10,20,30,40,50};
        System.out.println(Arrays.toString(Vetores.copiarTrechoVetor(v, 15, 20)));
        Entrada.fechar();
    }
}
