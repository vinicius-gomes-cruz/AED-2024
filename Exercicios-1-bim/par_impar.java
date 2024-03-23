import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println("Esse numero é par");
        }else {
            System.out.println("Esse numero é impar");
        }
        entrada.close();
    }
}