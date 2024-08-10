package libs;

public class Matematica {
    public static int menor(int a, int b){
        if (a < b) {
            return a;
        }
        return b;
    }

    public static int maior(int a, int b){
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void tabuada(int a){
        for (int i = 0; i <= 9; i++) {
            System.out.println(a * i);
        }
    }

}
