package aulas;

import java.util.Arrays;

import libs.Entrada;
import libs.Exercicios;
import libs.Vetores;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        System.out.println(Arrays.toString(Vetores.lerInteiros(5)));
        Entrada.fechar();
    }
}
