public class NumeroPerfeito {
    public static void main(String[] args) {
        numperfeito();
    }

    public static void numperfeito() {
        for (int n = 1; n <= 10000; n++) {
            int soma = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    soma += i;
                }
            }
            if (soma == n) {
                System.out.println(n);
            }
        }

    }
}
