package atividade01;

import static java.lang.Math.*;
import java.util.Scanner;

public class CalcularCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo ");
        double raio = scanner.nextDouble();
        System.out.println("A area do circulo e: " + Math.PI * pow(raio, 2));
        scanner.close();
    }

}
