import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i,valor = 1,n = entrada.nextInt();
        
        i = n;
        while (i > 0) {
            valor = valor * i;
            i--;
        }
        entrada.close();

        System.out.println("Fatorial de " + n + " e igual a " + valor);
    }
}