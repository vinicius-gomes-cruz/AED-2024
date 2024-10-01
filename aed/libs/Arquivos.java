package libs;

import java.io.FileWriter;

public class Arquivos {

    public static void ex1() {
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
}
