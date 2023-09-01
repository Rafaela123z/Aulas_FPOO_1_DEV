/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos.atividades;

/**
 *
 * @author Aluno
 */
public class PostRedeSocial implements ClassificacaoPost{
    private String usuario;
    private String legeda;
    private int comentarios;
    private int estrela;

    public PostRedeSocial(String usuario, String legeda, int comentarios) {
        this.usuario = usuario;
        this.legeda = legeda;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "PostRedeSocial{" + "usuario=" + usuario + ", legeda=" + legeda + ", comentarios=" + comentarios + ", estrela=" + estrela + '}';
    }

    @Override
    public void avaliarComoComum() {
        this.estrela = 1;
    }

    @Override
    public void avaliarComoLegal() {
        this.estrela = 3;
    }

    @Override
    public void avaliarComoSuperLegal() {
        this.estrela = 5;
    }
    
    
    
    
}
