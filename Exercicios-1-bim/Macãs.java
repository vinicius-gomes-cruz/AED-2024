public class Macãs {

    public static float macas(float macas) {
        if (macas < 12)
            return  macas * 0.30f;
        return macas * 0.25f;
        
    }
    public static void main(String[] args) {
        System.out.println(macas(10f));
    }
}
