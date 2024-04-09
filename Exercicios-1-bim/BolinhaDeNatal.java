import java.util.Scanner;

public class BolinhaDeNatal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int B = scanner.nextInt();
        int G = scanner.nextInt();

        int falta = G / 2 - B;

        if (falta > 0) {
            System.out.println("Faltam" + falta + "bolinha(s)");
        }else {
            System.out.println("Amelia tem todas as bolinhas");
        }
        scanner.close();
    }
}
