import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
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
}
