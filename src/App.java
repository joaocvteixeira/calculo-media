import java.util.Scanner;

public class App {
    
    public static double calculoDeMedia(double numero1, double numero2) {
        double media = (numero1 + numero2) / 2;
        return media;
    }

    public static void main(String[] args) throws Exception {
        double nota1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a nota da primeira avaliação do aluno: ");
        nota1 = ler.nextDouble();

        double nota2;
        System.out.println("Digite a nota da segunda avaliação do aluno: ");
        nota2 = ler.nextDouble();

        double notaDoAluno = calculoDeMedia(nota1, nota2);
        System.out.println("A média das notas de João é de " + notaDoAluno + " Pontos");
    }

}
