package libs;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {
    public static int menor(int n1, int n2) {
        if (n1 < n2) {
            return n1;
        }
        return n2;
    }

    public static void exMenorNumero() {
        int a, b, menor;
        Entrada.abrir();
        a = Entrada.lerInt("Digite um numero");
        b = Entrada.lerInt("Digite outro numero");
        Entrada.fechar();

        menor = menor(a, b);

        System.out.println("O menor valor é " + menor);
    }

    public static void exLerInteiro() {
        Entrada.abrir();

        int x = Entrada.lerInt("Digite um numero");
        System.out.println("Foi digitado o valor " + x);

        Entrada.fechar();
    }

    public static void automovel(String marca, float kmIni, float kmFin, float litrosCon, float capacidade) {
        float kmLitro = (kmFin - kmIni) / litrosCon;
        float autonomia = capacidade * kmLitro;
        System.out.println("O veiculo da " + marca + " percorreu " + kmLitro + " km/litro");
        System.out.println("O veiculo da " + marca + " possui uma autonomia de " + autonomia + " km/tanque");
    }

    public static void bolinhaDeNatal() {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int G = scanner.nextInt();

        int falta = G / 2 - B;

        if (falta > 0) {
            System.out.println("Faltam" + falta + "bolinha(s)");
        } else {
            System.out.println("Amelia tem todas as bolinhas");
        }
        scanner.close();
    }

    public static int contador(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n - 1);
        return contador(n - 1);
    }

    public static float cubo(float comp, float altura, float espe) {
        float volume = comp * altura * espe;
        return volume;
    }

    public static void divisores() {
        int n, i = 1;
        Scanner entrada = new Scanner(System.in);

        n = entrada.nextInt();
        System.out.println("Divisores");
        while (i < n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }

        entrada.close();
    }

    public static void jogo1() {
        Scanner entrada = new Scanner(System.in);
        float horaInicial = entrada.nextFloat();
        float minutoInicial = entrada.nextFloat();
        float horaFinal = entrada.nextFloat();
        float minutoFinal = entrada.nextFloat();

        float minTotalFinal = horaFinal * 60 + minutoFinal;
        float minTotalInicial = horaInicial * 60 + minutoInicial;
        float horaTotal = minTotalFinal - minTotalInicial;
        System.out.println(horaTotal);
        entrada.close();
    }

    public static void jogo2() {
        Scanner entrada = new Scanner(System.in);
        float horaInicial = entrada.nextFloat();
        float minutoInicial = entrada.nextFloat();
        float horaFinal = entrada.nextFloat();
        float minutoFinal = entrada.nextFloat();

        float minTotalFinal = horaFinal * 60 + minutoFinal;
        float minTotalInicial = horaInicial * 60 + minutoInicial;
        float horaTotal = minTotalFinal - minTotalInicial;
        System.out.println(horaTotal);
        entrada.close();
    }

    public static float IMC(float altura, float peso) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fatorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static float macas(float macas) {
        if (macas < 12)
            return macas * 0.30f;
        return macas * 0.25f;

    }

    public static void maiorMenor() {
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        int maior = 0;
        int menor = 0;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 < num3) {
                menor = num2;
            } else {
                menor = num3;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 < num3) {
                menor = num1;
            } else {
                menor = num3;
            }
        } else if (num3 > num1 && num3 > num2) {
            maior = num3;
            if (num1 < num2) {
                menor = num1;
            } else {
                menor = num2;
            }
        }
        System.out.println("O maior numero é o " + maior);
        System.out.println("O menor numero é o " + menor);
        entrada.close();
    }

    public static int mdc(int n1, int n2) {
        int i = Math.min(n1, n2);
        while (!(n1 % i == 0 && n2 % i == 0)) {
            i--;
        }
        return i;
    }

    public static int mmc(int n1, int n2, int i) {
        if (i % n1 + i % n2 == 0) {
            return i;
        }
        return mmc(n1, n2, i + 1);
    }

    public static void multiplos() {
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        if (n1 % n2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        entrada.close();
    }

    public static void nadador(int idade) {
        if (idade >= 18) {
            System.out.println("");
        }
    }

    public static boolean numperfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        if (soma == n) {
            return true;
        } else {
            return false;
        }

    }

    public static void par_impar_while1() {
        Scanner entrada = new Scanner(System.in);

        int i, valor, qtd_pares, qtd_impares;

        i = 1;
        qtd_impares = 0;
        qtd_pares = 0;

        while (i <= 5) {
            System.out.println("Digite o " + i + " numero");
            valor = entrada.nextInt();
            if (valor % 2 == 0) {

                qtd_pares += 1;
            } else {
                qtd_impares += 1;
            }
            i += 1;
        }

        entrada.close();

        System.out.println("impares: " + qtd_impares);
        System.out.println("pares: " + qtd_pares);

    }

    public static void piramide(int n) {
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                if (i == j) {
                    System.out.print("\n");
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }

    public static void primo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("O numero não é primo");
                return;
            }
        }

        System.out.println("O numero é primo");
    }

    public static void soma_while() {
        Scanner entrada = new Scanner(System.in);

        int i, a, b, soma = 0;

        System.out.println("Digite o 1 numero");
        a = entrada.nextInt();
        System.out.println("Digite o 2 numero");
        b = entrada.nextInt();

        i = a;

        while (i <= b) {
            soma += i;
            i++;
        }

        entrada.close();

        System.out.println("A soma dos valores de " + a + " a " + b + " é " + soma);
    }

    public static String triangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB) {
            return "Esse triangulo pode existir";
        } else {
            return "Esse triangulo não pode existir";
        }
    }

    public static String convertePosicaoParaMaiscula(String entrada, int pos) {
        return entrada.substring(0, pos) + entrada.substring(pos, pos + 1).toUpperCase() + entrada.substring(pos + 1);
    }

    public static int obterPosicaoProxChar(String entrada, int pos, char c) {
        int index = -1;

        for (int i = pos; i < entrada.length(); i++) {
            if (entrada.charAt(i) == c) {
                return i;
            }
        }

        return index;
    }

    public static String removerCaracterDaSentenca(String entrada, char c) {
        String resp = "";
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) != c) {
                resp += entrada.charAt(i);
            }
        }
        return resp;
    }

    public static void vetores1() {
        int numero;
        int media = 0;
        int maiores = 0;
        int[] vetor = new int[8];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            numero = entrada.nextInt();
            vetor[i] = numero;
            media += vetor[i];
        }

        media = media / 8;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                maiores += 1;
            }
        }

        System.out.println(maiores);

        entrada.close();
    }

    public static void vetores2() {
        int[] va = new int[10];
        int[] vb = new int[10];
        int[] vc = new int[10];
        int j = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                va[i] = entrada.nextInt();
            } else {
                vb[j] = entrada.nextInt();
                j++;
            }
        }

        for (int i = 0; i < vc.length; i++) {
            if (i % 2 == 0) {
                vc[i] = va[i] + vb[i];
            } else {
                vc[i] = va[i] - vb[i];
            }
        }

        System.out.println(Arrays.toString(va));
        System.out.println(Arrays.toString(vb));
        System.out.println(Arrays.toString(vc));

        entrada.close();
    }
}
