public class Piramide {
    public static void main(String[] args) {
        piramide(7);
    }

    public static void piramide(int n){
        int j = 1;
        while (j <= n) {
            int i = 1;
            while (i <= j) {
                if (i == j) {
                    System.out.print("\n");
                    i++;
                    continue;
                }
                System.out.print(i);
                i++;
            }
            j++;
        }
    }
}
