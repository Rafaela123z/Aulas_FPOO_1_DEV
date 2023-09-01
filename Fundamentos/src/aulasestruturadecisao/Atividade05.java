package aulasestruturadecisao;

import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual automovel voce deseja alugar? ( coloque por numeros)");

        int automovel = scanner.nextInt();
        System.out.println("Por quantos dias voce deseja ficar com o automovel?");
        int dias = 0;

        System.out.println("Quantos km voce pretende rodar com o veiculo?");
        double valorKM = 0;
        
        double valorDiaria;
        double qtdeKmRodados = scanner.nextDouble();
        double valorTotal = 0;

        if (automovel == 1) {
            valorDiaria = 98;
            valorKM = 2.39;
            valorTotal = (valorDiaria * dias) + (valorKM * qtdeKmRodados);
        } else if (automovel == 2) {
            valorDiaria = 79;
            valorKM = 1.99;
            valorTotal = (valorDiaria * dias) + (valorKM * qtdeKmRodados);
        } else if (automovel == 3) {
            valorDiaria = 102;
            valorKM = 2.99;
            valorTotal = (valorDiaria * dias) + (valorKM * qtdeKmRodados);
        }
        System.out.println("O valor total a ser pago sera: " + valorTotal);
    }
}
