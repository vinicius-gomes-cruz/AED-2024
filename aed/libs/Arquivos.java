package libs;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Arquivos {

    public static void ex01() {
        String nome_arquivo = "teste.txt";
        
        try{
            FileWriter arquivo = new FileWriter(nome_arquivo);

            arquivo.write("Algoritmos.\n");

            for (int i = 0; i < 10; i++) {
                arquivo.write(i + "\n");
            }

            arquivo.close();
        } catch (Exception e) {
            System.out.println("Erro");
            System.err.println(e);
        }
    }

    public static void ex02() {
        String nome_arquivo = "teste.txt";
        int numero;
        try{
            File arquivo = new File(nome_arquivo);
            Scanner entrada = new Scanner(arquivo);

            for (int i = 0; i < 10; i++) {
                numero = entrada.nextInt();
                System.out.println(numero);

            }
            entrada.close();

        } catch (Exception e) {
            System.out.println("Erro");
            System.err.println(e);
        }
    }
}
