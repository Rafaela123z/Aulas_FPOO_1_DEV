/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividades;

/**
 *
 * @author Aluno
 */
public class RedeSocial {

    public static void main(String[] args) {
        PostRedeSocial post1 = new PostRedeSocial("Amanda", "Almoço num restaurante", 99999);
        post1.avaliarComoLegal();
        System.out.println(post1);

        PostRedeSocial post2 = new PostRedeSocial("Edson", "fazendo churrasco legal 😒", 65415);
        post2.avaliarComoComum();
        System.out.println(post2);

        PostRedeSocial post3 = new PostRedeSocial("Gustavo", "Mudando estilo do cabelo", 84615);
        post3.avaliarComoSuperLegal();
        System.out.println(post3);
    }
}
