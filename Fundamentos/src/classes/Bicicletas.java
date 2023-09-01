/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicletas {

    // atributos, são as características da "bicicleta"
    private int qtdeRodas;
    private boolean marcha;
    private int qtdeMarchas;
    private String modelo;
    private boolean freio;
    private String cor;
    private String situacao;
    private int velocidade;

    // construtor sem argumentos
    public Bicicletas() {
    }

    // construtor com argumentos
    public Bicicletas(int qtdeRodas, boolean marcha, int qtdeMarchas, String modelo, boolean freio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.marcha = marcha;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.freio = freio;
        this.cor = cor;
        this.situacao = "parada";
        this.velocidade = 0;
    }

    // ações da bicicleta
    public void andar(int velocidade) {
        this.situacao = "andando";
        this.velocidade = velocidade;
    }

    public boolean temFreio() {
        return this.freio;
    }
    
    public void freiar() {
    this.situacao = "freiando";
        this.velocidade -= 1;
    }

    @Override
    public String toString() {
        return "Bicicletas{" + "qtdeRodas=" + qtdeRodas + ", marcha=" + marcha + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", freio=" + freio + ", cor=" + cor + ", situacao=" + situacao + ", velocidade=" + velocidade + '}';
    }

  

}
