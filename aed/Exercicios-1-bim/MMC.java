public class MMC {
    public static void main(String[] args) {
        System.out.println(mmcRecursivo(5, 6, 6));
    }

    public static int mmc(int n1, int n2){
        int i = Math.max(n1, n2);
        while (!(i % n1 == 0 && i % n2 == 0)) {
            i++;
        }
        return i;
    }

    public static int mmcRecursivo(int n1, int n2, int i){
        if (i % n1 + i % n2 == 0) {
            return i;
        }
        return mmcRecursivo(n1, n2, i+1);
    }
}