public class Primo {
    public static void main(String[] args) {
        primo(7);
    }

    public static void primo(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("O numero não é primo");
                return;
            }
        }

        System.out.println("O numero é primo");
    }
}
