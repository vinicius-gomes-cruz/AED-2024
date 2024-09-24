package aulas;

import java.util.Arrays;

import libs.Entrada;
import libs.Exercicios;
import libs.Vetores;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        String[] v = {"A","B","C","D","E","F","G","H","J"};
        System.out.println(Arrays.toString(Vetores.obterIndices(v, "a")));
        Entrada.fechar();
    }
}
