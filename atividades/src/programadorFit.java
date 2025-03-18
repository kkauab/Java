import java.util.Scanner;

public class programadorFit {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu sexo (Digite M para Masculino e F para Feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            double pesoIdeal;
            if (sexo == 'M'){
                pesoIdeal = (72.7 * altura) - 58;
            } else if (sexo == 'F') {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                System.out.println("Sexo Invalido. Use apenas M ou F");
                return;
            }
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
    }
}
