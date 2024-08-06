public class Contador {
    public static void main(String[] args) {
        contador(12);
    }

    public static int contador(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.println(n - 1);
        return contador(n - 1);
    }
}
