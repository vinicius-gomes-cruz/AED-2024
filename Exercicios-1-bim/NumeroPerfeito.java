public class NumeroPerfeito {
    public static void main(String[] args) {
        numperfeito(28);
    }

    public static void numperfeito(int n){
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        if (soma == n) {
            System.out.println("o numero é perfeito");
        } else {
            System.out.println("o numero não é perfeito");
        }
    }
}
