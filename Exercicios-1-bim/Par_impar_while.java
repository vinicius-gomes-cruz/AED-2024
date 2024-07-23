import java.util.Scanner;

public class Par_impar_while {
    public static void main(String[] args) {
        par_impar_while1();
    }

    public static void par_impar_while1(){
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

    public static void par_impar_while2(){
        Scanner entrada = new Scanner(System.in);

        int valor, qtd_pares, qtd_impares;
        qtd_impares = 0;
        qtd_pares = 0;
        valor = 0;

        while (valor >= 0) {
            if (valor % 2 == 0) {
                qtd_pares += 1;
            } else {
                qtd_impares += 1;
            }
            System.out.println("Digite 1 numero");
            valor = entrada.nextInt();
        }
        
        entrada.close();

        System.out.println("impares: " + qtd_impares);
        System.out.println("pares: " + qtd_pares);
    }
}
