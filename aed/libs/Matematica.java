package libs;

import java.util.Scanner;

public class Matematica {
    public static int menor(int a, int b){
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int maior(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void tabuada(int a){
        for (int i = 0; i <= 9; i++) {
            System.out.println(a * i);
        }
    }

    public static void fatorial(int n){
        int i,valor = 1;
        
        i = n;
        while (i > 0) {
            valor *= i;
            i--;
        }

        System.out.println("Fatorial de " + n + " e igual a " + valor);
    }

    public static void ehDivisor(){
        int n,i = 1;
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

    public static boolean ehPerfeito(int n) {
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

    public static void ehPrimo(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("O numero não é primo");
                return;
            }
        }

        System.out.println("O numero é primo");
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }


}
