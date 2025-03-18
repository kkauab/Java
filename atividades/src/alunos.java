import java.util.Scanner;

public class alunos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite sua primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite sua segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite sua terceira nota: ");
            double nota3 = scanner.nextDouble();

            if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10){
                System.out.println("Digite um numero entre 0 e 10");
                return;
            }
            double media = (nota1 + nota2 + nota3) / 3;

            if (media > 7.0){
                System.out.println("Média" + media + "Parabéns voce foi aprovado.");
            } else if (media >= 4.0) {
                double pontoFaltando = 7.0 - media;
                System.out.println("Media" + media + "Faltam: " + pontoFaltando + "pontos para aprovacao");
            } else {
                System.out.println("Infelizmente voce foi reprovado.");
            }
        }
    }
}
