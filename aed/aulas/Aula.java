package aulas;

import java.util.Arrays;

import libs.Entrada;
import libs.Exercicios;
import libs.Vetores;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        System.out.println(Arrays.toString((Vetores.copiarCaracteres(Vetores.alocarCaracteres(10)))));
        Entrada.fechar();
    }
}
