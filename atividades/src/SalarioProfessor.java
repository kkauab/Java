import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar o valor da hora aula
            System.out.print("Digite o valor da hora aula (em reais): ");
            double valorHoraAula = scanner.nextDouble();

            // Solicitar o número de aulas ministradas
            System.out.print("Digite o número de aulas ministradas: ");
            int numeroDeAulas = scanner.nextInt();

            // Solicitar a porcentagem de desconto do INSS
            System.out.print("Digite o percentual de desconto do INSS (em %): ");
            double descontoINSS = scanner.nextDouble();

            // Calcular o salário bruto
            double salarioBruto = valorHoraAula * numeroDeAulas;

            // Calcular o valor do desconto do INSS
            double valorDesconto = (descontoINSS / 100) * salarioBruto;

            // Calcular o salário líquido
            double salarioLiquido = salarioBruto - valorDesconto;

            // Exibir os resultados
            System.out.printf("Salário Bruto: RS" + salarioBruto );
            System.out.printf("Desconto do INSS: RS" + descontoINSS );
            System.out.printf("Salário Líquido: RS" + salarioLiquido );
        }
    }
}