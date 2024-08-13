public class Automovel {
    public static void automovel(String marca,float kmIni,float kmFin,float litrosCon,float capacidade ) {
        float kmLitro = (kmFin - kmIni) / litrosCon;
        float autonomia = capacidade * kmLitro;
        System.out.println("O veiculo da " + marca + " percorreu " + kmLitro + " km/litro");
        System.out.println("O veiculo da " + marca + " possui uma autonomia de " + autonomia + " km/tanque");
    }
    public static void main(String[] args) {
        automovel("Fiat", 100f, 200f, 20f, 60f);
    }
}
