Obs: Ao invés de feito com valores fixos como proposto no desafio, foi criado para que pudesse perguntar pelo valor e usar esse resultado.

====================================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Média de duas notas decimais
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + media);

        // 2. Casting - double para int
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // Casting
        System.out.println("O valor double convertido para int é: " + valorInt);

        // 3. Concatenação de char e String
        char letra = 'J';
        String palavra = "ava";
        String mensagem = letra + palavra;
        System.out.println("A mensagem concatenada é: " + mensagem);

        // 4. Cálculo do valor total
        double precoProduto = 5.50;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total é: R$ " + valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 100.0;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;
        System.out.printf("O valor de R$ %.2f é equivalente a $ %.2f%n", valorEmReais, valorEmDolares);

        // 6. Cálculo de preço com desconto
        double precoOriginal = 200.0;
        double percentualDesconto = 10.0; // 10%
        double desconto = (percentualDesconto / 100) * precoOriginal;
        double precoComDesconto = precoOriginal - desconto;
        System.out.printf("O novo preço com desconto é: R$ %.2f%n", precoComDesconto);

        scanner.close();
    }
}
