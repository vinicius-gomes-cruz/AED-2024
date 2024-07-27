public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(14);
    }

    public static void fibonacci(int n){
        int i = 1, n1 = 1,n2 = 1, fibo = 0;
        while (i <= n) {
            if (i <= 2){
                System.out.println(1);
                i++;
                continue;
            }
            
            fibo = n1 + n2;
            n1 = n2;
            n2 = fibo;
            System.out.println(fibo);
            i++;
        }
    }

    public static int fibonaccirec(int n) {
        if (n == 1 || n == 2){
            return 1;
        }

        return fibonaccirec(n-1) + fibonaccirec(n-2);
    }
}
