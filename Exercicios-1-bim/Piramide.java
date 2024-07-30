public class Piramide {
    public static void main(String[] args) {
        piramidefor(7);
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

    public static void piramidefor(int n){
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                if (i == j) {
                    System.out.print("\n");
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}
