/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class ComputadorMain {
    public static void main(String[] args) {
        Computador computador1 = new Computador(MemoriaEnum.DDR3, ProcessadorEnum.RYZEN, 900, "Windows");
        System.out.println(computador1);
    }
}
