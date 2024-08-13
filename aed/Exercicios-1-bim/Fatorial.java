
public class Fatorial {

    public static void main(String[] args) {
        fatorialfor(5);
    }

    public static void fatorial(int n){
        int i,valor = 1;
        
        i = n;
        while (i > 0) {
            valor *= i;
            i--;
        }

        System.out.println("Fatorial de " + n + " e igual a " + valor);
    }

    public static void fatorialfor(int n){
        int valor = 1;

        for (int i = n; i > 0; i--) {
            valor *= i;
        }

        System.out.println("Fatorial de " + n + " e igual a " + valor);
    }

    public static int fatorialRecursivo(int n){
        if (n == 0) {
            return 1;
        }

        return n * fatorialRecursivo(n-1);
    }
}