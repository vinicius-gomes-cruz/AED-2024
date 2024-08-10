package aulas;

import libs.Entrada;
import libs.Matematica;

public class Aula20 {
    public static void aula(){
        System.out.println("++ Aula do dia 09/08/2024 ++");
        // exLerInteiro();
        exMenorNumero();
    }

    private static void exMenorNumero() {
        int a, b, menor;
        Entrada.abrir();
        a = Entrada.lerInt("Digite um numero");
        b = Entrada.lerInt("Digite outro numero");
        Entrada.fechar();

        menor = Matematica.menor(a, b);

        System.out.println("O menor valor é " + menor);
    }

    public static void exLerInteiro(){
        Entrada.abrir();

        int x = Entrada.lerInt("Digite um numero");
        System.out.println("Foi digitado o valor " + x);

        Entrada.fechar();
    }
}
