import java.util.Scanner;

public class fazendadopai {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double pesoTotal = 0;
            int numeroBois = 0;
            double pesoMaisGordo = Double.MIN_VALUE;
            double pesoMaisMagro = Double.MAX_VALUE;

            while(true){
            System.out.print("Digite o peso do boi em kg ou 0 para encerrar");
            double peso = scanner.nextDouble();

            if(peso == 0){
                break;
            }

            pesoTotal += peso;
            numeroBois++;

            if(peso > pesoMaisGordo){
                pesoMaisGordo = peso;
            }

            if(peso < pesoMaisMagro){
                pesoMaisMagro = peso;
            }
            }

            if(numeroBois > 0){
                double pesoMedio = pesoTotal/numeroBois;
            System.out.println("Peso médio do rebanho: " + pesoMedio + "kg");
            System.out.println("Peso do boi mais gordo: " + pesoMaisGordo + "kg");
            System.out.println("peso do boi mais magro: " + pesoMaisMagro + "kg");
            } else {
                System.out.println("Nenhum peso foi registrado.");
            }
        }
    }
}