

package aulaestruturadecisao;

import java.util.Scanner;


public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual veiculo voce deseja alugar? Opcao 1: Fiat Argo. Opcao 2: Fiat Mobi. Opcao 3: Hyundai Hb20.");
        int veiculo = scanner.nextInt();
        System.out.println("Por quantos dias voce deseja ficar com o veiculo?");
        int dias = scanner.nextInt();
        System.out.println("Quantos km voce pretende rodar com o carro?");
        double qtdeKmRodados = scanner.nextDouble();
        double valorDiaria;
        double valorKm;
        double valorTotal =0;
        
        if (veiculo == 1) {
            valorDiaria = 98;
            valorKm = 2.39; 
            valorTotal = (valorDiaria * dias) + (valorKm * qtdeKmRodados);
        } else if (veiculo ==2) {
            valorDiaria = 79;
            valorKm = 1.99;
            valorTotal = (valorDiaria * dias) + (valorKm * qtdeKmRodados);
        } else if (veiculo == 3){
        valorDiaria = 102;
        valorKm = 2.99;
        valorTotal = (valorDiaria * dias) + (valorKm * qtdeKmRodados);
        }
        System.out.println("O valor total sera " + valorTotal);
    }
}
