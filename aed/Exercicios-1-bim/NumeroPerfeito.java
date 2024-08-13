public class NumeroPerfeito {
    public static void main(String[] args) {
        for (int n = 1; n <= 10000; n++) {
            if (numperfeito(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean numperfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        if (soma == n) {
            return true;
        } else {
            return false;
        }

    }
}
