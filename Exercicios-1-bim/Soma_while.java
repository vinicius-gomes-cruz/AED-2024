import java.util.Scanner;

public class Soma_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,soma = 0;

        System.out.println("Digite o 1 numero");
        a = entrada.nextInt();
        System.out.println("Digite o 2 numero");
        b = entrada.nextInt();

        while (a <= b) {
            soma += a;
            a++;
        }

        entrada.close();

        System.out.println("Soma " + soma);
    }
}
