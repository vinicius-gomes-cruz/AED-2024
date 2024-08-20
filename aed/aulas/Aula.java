package aulas;

import libs.Entrada;
import libs.Exercicios;

public class Aula {
    public static void aula(){
        Entrada.abrir();
        System.out.println(Exercicios.removerCaracterDaSentenca("teste", 'e'));
        Entrada.fechar();
    }
    
}
