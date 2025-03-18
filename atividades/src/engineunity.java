import java.util.Scanner;

public class engineunity {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o Tempo Gasto na Viagem em horas: ");
            double tempo = scanner.nextDouble();

            System.out.println("Digite a velocidade média em km/h");
            double velocidadeMedia = scanner.nextDouble();

            double distancia = tempo * velocidadeMedia;

            System.out.println("Digite o consumo médio do veiculo em km/l");
            double consumo = scanner.nextDouble();

            double consumoCombustivel = distancia / consumo;

            System.out.println("\nResultados: ");
            System.out.println("Distancia percorrida: " + distancia + " km");
            System.out.println("Consumo de combustivel: " + consumoCombustivel + "L");
        }

    }
}
