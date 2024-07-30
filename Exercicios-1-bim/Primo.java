public class Primo {
    public static void main(String[] args) {
        primo(7);
    }

    public static void primo(int n){
        int primo = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                primo += i;
            }
        }

        if (primo == n+1) {
            System.out.println("O numero é primo");
        } else {
            System.out.println("O numero não é primo");
        }
    }
}
