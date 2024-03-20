import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        float num1;
        float num2;

        Calculadora calculadora;
        double resultado = 0;

        do {
            System.out.println("Informe o tipo de operação que deseja realizar: ");
            System.out.println("~~adição - 1");
            System.out.println("~~subtração - 2");
            System.out.println("~~multiplicação - 3");
            System.out.println("~~divisão - 4");
            System.out.println("~~encerrar - 5");
            System.out.print("\nopção: ");
            opcao = scanner.nextInt();

            if (opcao == 5) {
                if (opcao >= 1 && opcao <= 4) {
                    System.out.println("Informe os valores: ");
                    num1 = scanner.nextFloat();
                    num2 = scanner.nextFloat();
    
                    calculadora = new Calculadora(num1, num2, opcao);
                    resultado = calculadora.getResult();
                } else if (opcao == 5) {
                    break;
                } else {
                    System.out.println("Operação inválida!");
                }
            }
        } while (opcao != 5);

        System.out.printf("O valor final da conta é: %.2f", resultado);
    }
}
