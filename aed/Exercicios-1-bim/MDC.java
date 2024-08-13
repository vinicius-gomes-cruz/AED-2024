public class MDC {
    public static void main(String[] args) {
        System.out.println(mdc(3, 9));
    }

    public static int mdc(int n1, int n2){
        int i = Math.min(n1, n2);
        while (!(n1 % i == 0 && n2 % i == 0)) {
            i--;
        }
        return  i;
    }
}
