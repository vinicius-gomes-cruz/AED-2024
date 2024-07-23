import java.util.Scanner;

public class Par_impar_while {
    public static void main(String[] args) {
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
}
