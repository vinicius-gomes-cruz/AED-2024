package aulas;

import libs.Entrada;
import libs.Exercicios;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        System.out.println(Exercicios.fibonacci(4));
        Entrada.fechar();
    }
    
}
