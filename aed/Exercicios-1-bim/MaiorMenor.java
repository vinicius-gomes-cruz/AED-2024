import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
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
}
