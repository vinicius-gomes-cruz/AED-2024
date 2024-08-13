public class qtdPrimos {
    public static void main(String[] args) {
        int n_primos = 0, n = 2;
        while (n_primos < 5) {
            if (qtdprimo(n)) {
                n_primos += 1;
            }
            n++;
        }
    }
    public static boolean qtdprimo(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        System.out.println(n);
        return true;
    }
}