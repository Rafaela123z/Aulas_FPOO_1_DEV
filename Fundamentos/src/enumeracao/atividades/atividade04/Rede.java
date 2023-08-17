/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade04;

/**
 *
 * @author Aluno
 */
public class Rede {
    public static void main(String[] args) {
        ClasseRedes fotos = new ClasseRedes(EnumRedes.FOTOS.getRede());
        System.out.println(fotos);
        ClasseRedes post = new ClasseRedes(EnumRedes.POST.getRede());
        System.out.println(post);
        ClasseRedes videos = new ClasseRedes(EnumRedes.VIDEOS.getRede());
        System.out.println(videos);
    }
    
    
    
    
}
