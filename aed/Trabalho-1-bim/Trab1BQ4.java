import java.util.Scanner;

public class Trab1BQ4 {

  static Scanner entrada;

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


  public static void main(String[] args) {
    // Variáveis

    int L;
    int C;

    // Entrada de dados

    entradaAbrir();
    System.out.println("Digite a coluna");
    C = lerInt();
    System.out.println("Digite a linha");
    L = lerInt();
    entradaFechar();

    // Processamento

    if (C % 2 == 1 && L % 2 == 1) {
        System.out.println("branca");
    }
    if (C % 2 == 1 && L % 2 == 0) {
        System.out.println("preta");
    }
    if (C % 2 == 0 && L % 2 == 1) {
        System.out.println("preta");
    }
    if (C % 2 == 0 && L % 2 == 0) {
        System.out.println("branca");
    }
  }
}