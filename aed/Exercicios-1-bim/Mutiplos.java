import java.util.Scanner;

public class Mutiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        if (n1 % n2 == 0) {
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
        entrada.close();
    }
}
