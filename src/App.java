public class App {
    
    public static int calculoDeMedia(int numero1, int numero2) {
        int media = (numero1 + numero2) / 2;
        return media;
    }

    public static void main(String[] args) throws Exception {
        int notaDoJoao = calculoDeMedia(5, 9);
        System.out.println("A média das notas de João é de " + notaDoJoao + " Pontos");
    }

}
