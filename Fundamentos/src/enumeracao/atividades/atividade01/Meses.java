/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade01;

/**
 *
 * @author Aluno
 */
public class Meses {
    public static void main(String[] args) {
        ClasseMeses marco = new ClasseMeses(EnumMeses.MARCO.getMes());
        System.out.println(marco);
        ClasseMeses janeiro = new ClasseMeses(EnumMeses.JANEIRO.getMes());
        System.out.println(janeiro);
        ClasseMeses abril = new ClasseMeses(EnumMeses.ABRIL.getMes());
    }
}
