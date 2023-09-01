/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Computador02 {

    public static void main(String[] args) {
        Computador computador = new Computador(ComputadorMemoriaEnum.DEZESSEIS, ComputadorProcessadorEnum.INTEL_CORE, 800, "Windows", true);
        System.out.println(computador);
    }
}