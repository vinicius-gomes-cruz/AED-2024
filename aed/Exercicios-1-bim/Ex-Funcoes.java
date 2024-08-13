import java.util.Scanner;

class ex1 {


    public static void jogo1() {
        Scanner entrada = new Scanner(System.in);
        float horaInicial = entrada.nextFloat();
        float minutoInicial = entrada.nextFloat();
        float horaFinal = entrada.nextFloat();
        float minutoFinal = entrada.nextFloat();

        float minTotalFinal = horaFinal * 60 + minutoFinal;
        float minTotalInicial = horaInicial * 60 + minutoInicial;
        float horaTotal = minTotalFinal - minTotalInicial;
        System.out.println(horaTotal);
        entrada.close();
    }

    public static void jogo2() {
        Scanner entrada = new Scanner(System.in);
        float horaInicial = entrada.nextFloat();
        float minutoInicial = entrada.nextFloat();
        float horaFinal = entrada.nextFloat();
        float minutoFinal = entrada.nextFloat();

        float minTotalFinal = horaFinal * 60 + minutoFinal;
        float minTotalInicial = horaInicial * 60 + minutoInicial;
        float horaTotal = minTotalFinal - minTotalInicial;
        System.out.println(horaTotal);
        entrada.close();
    }

    public static float IMC(float altura, float peso) {
        float imc = peso / (altura * altura);
        return imc;
    }

    public static int soma(int valor) {
        return valor += 5;
    }


    public static void main(String[] args) {
        System.out.println(IMC(1.80f, 80));
        System.out.println(soma(10));
    }
}