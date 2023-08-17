/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade02;

/**
 *
 * @author Aluno
 */
public class Livros {
    public static void main(String[] args) {
        ClasseLivros distopia = new ClasseLivros(EnumLivros.DISTOPIA.getLivros());
        System.out.println(distopia);
        ClasseLivros romance = new ClasseLivros(EnumLivros.ROMANCE.getLivros());
        System.out.println(romance);
        ClasseLivros fantasia = new ClasseLivros(EnumLivros.FANTASIA.getLivros());
        System.out.println(fantasia);
    }
}
