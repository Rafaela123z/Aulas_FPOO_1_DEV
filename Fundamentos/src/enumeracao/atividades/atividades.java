/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public class atividades {
    public static void main(String[] args) {
        
        
        MesesDoAno mesesDoAno = new MesesDoAno("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro");
        System.out.println(mesesDoAno);
        
        CategoriaLivros categoriaLivros = new CategoriaLivros("romance", "terror", "comedia", "suspense", "educativo");
        System.out.println(categoriaLivros);
        
        ProdutosCantina produtosCantina = new ProdutosCantina("trufa", "balas", "pirulito", "pacoca", "refrigerante", "suco", "lanche", "salgado");
        System.out.println(produtosCantina);
        
        RedesSociais redesSociais = new RedesSociais("noticias", "mensagens", "fotos");
        System.out.println(redesSociais);
    }
    
}
