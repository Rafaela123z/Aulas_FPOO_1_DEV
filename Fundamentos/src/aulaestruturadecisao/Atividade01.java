package aulaestruturadecisao;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual cargo voce ocupa? Digite 1 para gerente. Digite 2 para supervisor. Digite 3 para tecnico. Digite 4 para auxiliar.");
        int cargo = scanner.nextInt();
        double salarioFinal = 0;
        double salario;
        double INSS;
        double convenio;

        if (cargo == 1) {
            salario = 5590.00;
            INSS = 8;
            INSS = salario * (INSS / 100);
            convenio = 289;
            salarioFinal = salario - INSS - convenio;
        } else if (cargo == 2) {
            salario = 4128.00;
            INSS = 7;
            INSS = salario * (INSS / 100);
            convenio = 239;
            salarioFinal = salario - INSS - convenio;
        } else if (cargo == 3) {
            salario = 3789.00;
            INSS = 4;
            INSS = salario * (INSS / 100);
            convenio = 189;
            salarioFinal = salario - INSS - convenio;
        } else if (cargo == 4) {
            salario = 2345.00;
            INSS = 2;
            INSS = salario * (INSS / 100);
            convenio = 156;
            salarioFinal = salario - INSS - convenio;
        }
        System.out.println("Seu salario e: " + salarioFinal);
    }
}
