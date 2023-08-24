/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Sala {

    private int cadeiras;
    private int mesas;
    private int numeroSala;
    private boolean projetor;
    private boolean computadores;
    private int qtdeComputadores;

    public Sala(int cadeiras, int mesas, int numeroSala, boolean projetor, boolean computadores, int qtdeComputadores) {
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.numeroSala = numeroSala;
        this.projetor = projetor;
        this.computadores = true;
        this.qtdeComputadores = qtdeComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "cadeiras=" + cadeiras + ", mesas=" + mesas + ", numeroSala=" + numeroSala + ", projetor=" + projetor + ", computadores=" + computadores + ", qtdeComputadores=" + qtdeComputadores + '}';
    }

    public boolean funcionamentoProjetor() {
        return this.projetor = true;
    }

    public boolean funcionamentoComputadores() {
        return this.computadores = true;
    }

}
