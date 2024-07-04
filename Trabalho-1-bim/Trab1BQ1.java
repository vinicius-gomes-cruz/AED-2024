import java.util.Scanner;

public class Trab1BQ1 {

  static Scanner entrada;
  static int valor;

  // Módulo para abrir a entrada
  public static void entradaAbrir() {
    entrada = new Scanner(System.in);
  }

  // Módulo para fechar a entrada
  public static void entradaFechar() {
    entrada.close();
  }

  // Módulo para ler um valor inteiro
  public static int lerInt() {
    return entrada.nextInt();
  }

  public static int separarnota(int nota) {
    int notas;
    notas = valor / nota;
    valor = valor - (nota * notas);
    return notas;
  }


  public static void main(String[] args) {
    // Variáveis
    int nota100 = 0;
    int nota50 = 0;
    int nota20 = 0;
    int nota10 = 0;
    int nota5 = 0;
    int nota2 = 0;
    int nota1 = 0;

    // Entrada de dados

    entradaAbrir();
    System.out.println("Quanto deseja sacar?");
    valor = lerInt();
    entradaFechar();

    // Processamento

    if (valor >= 100) {
        nota100 = separarnota(100);
    }
    if (valor >= 50) {
        nota50 = separarnota(50);
        System.out.println(valor);
    }
    if (valor >= 20) {
        nota20 = separarnota(20);
        System.out.println(valor);
    }
    if (valor >= 10) {
        nota10 = separarnota(10);
        System.out.println(valor);
    }
    if (valor >= 5) {
        nota5 = separarnota(5);
        System.out.println(valor);
    }
    if (valor >= 2) {
        nota2 = separarnota(2);
        System.out.println(valor);
    }
    if (valor >= 1) {
        nota1 = separarnota(1);
        System.out.println(valor);
    }

    // Saída

    System.out.println(nota100 + " Notas de R$ 100 \n" + nota50 + " Notas de R$ 50 \n" + nota20 + " Notas de R$ 20 \n" + nota10 + " Notas de R$ 10 \n" + nota5 + " Notas de R$ 5 \n" + nota2 + " Notas de R$ 2 \n" + nota1 + " Notas de R$ 1");
  }
}