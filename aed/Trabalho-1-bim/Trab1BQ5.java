import java.util.Scanner;

public class Trab1BQ5 {

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

  // Módulo para ler um valor float
  public static float lerFloat() {
    return entrada.nextFloat();
  }

  // Módulo para ler um valor String
  public static String lerString() {
    return entrada.next();
  }

  public static void main(String[] args) {
    // Variáveis

    float a;
    float b;
    float c;
    float x1;
    float x2;
    float delta;

    // Entrada de dados
    entradaAbrir();
    System.out.println("entre com o valor de a");
    a = lerFloat();
    System.out.println("entre com o valor de b");
    b = lerFloat();
    System.out.println("entre com o valorr de c");
    c = lerFloat();
    entradaFechar();

    // Processamento

    delta = (b*b) - (4 * a * c);
    System.out.println(delta);
    x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
    x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
    // Saída
    if (delta < 0) {
        System.out.println("Sem raizes no conjunto dos numeros reais");
    }else{
        System.out.println("x1: "+ x1 + " x2: " + x2);
    }
  }
}