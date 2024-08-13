import java.util.Scanner;

public class Trab1BQ2 {

  static Scanner entrada;

  // Módulo para abrir a entrada
  public static void entradaAbrir() {
    entrada = new Scanner(System.in);
  }

  // Módulo para fechar a entrada
  public static void entradaFechar() {
    entrada.close();
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
    Float litros_vendidos;
    String tipo;
    Float Valor_pagar = 0f;

    // Entrada de dados

    entradaAbrir();
    System.out.println("Quantos litros foram vendidos?");
    litros_vendidos = lerFloat();
    System.out.println("Que tipo de combustivel foi vendido E(Etanol) ou G(Gasolina)?");
    tipo = lerString();
    entradaFechar();

    // Processamento

    if (tipo.equals("G") && litros_vendidos < 20){
        Valor_pagar = (5.60f * litros_vendidos) * 0.4f;
    } 
    if (tipo.equals("G") && litros_vendidos >= 20){
        Valor_pagar = (5.60f * litros_vendidos) * 0.6f;
    }
    if (tipo.equals("E") && litros_vendidos < 20){
        Valor_pagar = (5.60f * litros_vendidos) * 0.3f;
    } 
    if (tipo.equals("E") && litros_vendidos >= 20){
        Valor_pagar = (5.60f * litros_vendidos) * 0.5f;
    }

    // Saída
    System.out.println(Valor_pagar);
  }
}