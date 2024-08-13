public interface Cubo {

    public static float cubo(float comp, float altura, float espe) {
        float volume = comp * altura * espe;
        return volume;
    }
    public static void main(String[] args) {
        System.out.println(cubo(5f, 5f, 5f));
    }
}