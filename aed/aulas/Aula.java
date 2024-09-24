package aulas;

import java.util.Arrays;

import libs.Entrada;
import libs.Exercicios;
import libs.Vetores;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        int[] v = {1,2,3,1,4,0,3,9};
        System.out.println(Arrays.toString(Vetores.removerRepeticao(v)));
        Entrada.fechar();
    }
}
