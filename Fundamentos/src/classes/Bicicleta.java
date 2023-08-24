/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    // atributos, sao as caracteristicas da bicicleta
    private int qtdeRodas;
    private boolean marchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean freio;
    private String cor;
    private String situacao;
    private int velocidade;
    
    // construtor sem argumentos
    public Bicicleta(){
    
    }
    
    // construtor com argumentos

    public Bicicleta(int qtdeRodas, boolean marchas, int qtdeMarchas, String modelo, boolean freio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.marchas = marchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.freio = freio;
        this.cor = cor;
    }
    
    // acoes da bicicleta 
    public void andar(int velocidade){
       this.situacao = "andando";
       this.velocidade = velocidade;
    }
    
    //
    public boolean temFreio(){
        return this.freio;
    }
    
    public void freiar(){
    this.situacao = "Freiando";
        this.velocidade -= 1;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", marchas=" + marchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", freio=" + freio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }


    
    
}
