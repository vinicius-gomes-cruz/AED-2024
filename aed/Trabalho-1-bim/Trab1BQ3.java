import java.util.Scanner;

public class Trab1BQ3 {

  static Scanner entrada;
  static int numero;
  static String resposta = "";

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

  public static int dividirnumero(int divisor) {
    int resultado;
    resultado = numero / divisor;
    numero -= resultado * divisor;
    return resultado;
  }

  public static void main(String[] args) {
    // Variáveis
    int centena = 0;
    int dezena = 0;

    // Entrada de dados

    entradaAbrir();
    numero = lerInt();
    entradaFechar();

    // Processamento
    if (numero >= 100) {
      centena = dividirnumero(100);

      switch (centena) {
        case 1:
          resposta += "Centésimo ";
          break;
        case 2:
          resposta += "Ducentésimo ";
          break;
        case 3:
          resposta += "Tricentésimo ";
          break;
        case 4:
          resposta += "Quadringentésimo ";
          break;
        case 5:
          resposta += "Quingentésimo ";
          break;
        case 6:
          resposta += "Seiscentésimo ";
          break;
        case 7:
          resposta += "Setingentésimo ";
          break;
        case 8:
          resposta += "Octingentésimo ";
          break;
        case 9:
          resposta += "Nongentésimo ";
          break;
  
        default:
          break;
      }

    }
    if (numero >= 10) {
      dezena = dividirnumero(10);

      switch (dezena) {
        case 1:
          resposta += "Décimo ";
          break;
        case 2:
          resposta += "Vigésimo ";
          break;
        case 3:
          resposta += "Terceiro ";
          break;
        case 4:
          resposta += "Quadragésimo ";
          break;
        case 5:
          resposta += "Quinquagésimo ";
          break;
        case 6:
          resposta += "Sexagésimo ";
          break;
        case 7:
          resposta += "Setuagésimo ";
          break;
        case 8:
          resposta += "Octogésimo ";
          break;
        case 9:
          resposta += "Nonagésimo ";
          break;
  
        default:
          break;
      }
    }

    numero = dividirnumero(1);

    switch (numero) {
      case 1:
        resposta += "primeiro";
        break;
      case 2:
        resposta += "Segundo";
        break;
      case 3:
        resposta += "Terceiro";
        break;
      case 4:
        resposta += "Quarto";
        break;
      case 5:
        resposta += "Quinto";
        break;
      case 6:
        resposta += "Sexto";
        break;
      case 7:
        resposta += "Setimo";
        break;
      case 8:
        resposta += "Oitavo";
        break;
      case 9:
        resposta += "Nono";
        break;

      default:
        break;
    }

    // Saída
    System.out.println(resposta);
  }
}