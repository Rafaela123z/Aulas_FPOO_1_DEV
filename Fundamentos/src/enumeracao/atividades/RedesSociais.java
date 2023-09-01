/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class RedesSociais {

    private String noticias;
    private String mensagens;
    private String fotos;

    public RedesSociais(String noticias, String mensagens, String fotos) {
        this.noticias = noticias;
        this.mensagens = mensagens;
        this.fotos = fotos;
    }

    @Override
    public String toString() {
        return "RedesSociais{" + "noticias=" + noticias + ", mensagens=" + mensagens + ", fotos=" + fotos + '}';
    }
    
    
}
