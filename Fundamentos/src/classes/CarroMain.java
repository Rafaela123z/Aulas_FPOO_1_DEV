/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class CarroMain {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Duster", "Renault", CorEnum.ROXO , 2017, 4);
        System.out.println(carro1);
        carro1.andando();
        System.out.println(carro1);
        carro1.parado();
        System.out.println(carro1);
    }
}
