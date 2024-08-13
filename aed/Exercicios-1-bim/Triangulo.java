public class Triangulo {

    public static String triangulo(int ladoA, int ladoB, int ladoC){
        if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoA + ladoC > ladoB) {
            return "Esse triangulo pode existir";
        }else {
            return "Esse triangulo não pode existir";
        }
    }
    public static void main(String[] args) {
        System.out.println(triangulo(1 , 2, 3));
    }
}