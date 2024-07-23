import java.util.Scanner;

public class Soma_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i,a,b,soma = 0;

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

        System.out.println("A soma dos valores de " + a + " a " +  b + " é " + soma);
    }
}
