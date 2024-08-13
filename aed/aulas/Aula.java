package aulas;

import libs.Entrada;
import libs.Exercicios;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        int n = Entrada.lerInt();
        System.out.println(Exercicios.fibonacci(n));
        Entrada.fechar();
    }

    
}
