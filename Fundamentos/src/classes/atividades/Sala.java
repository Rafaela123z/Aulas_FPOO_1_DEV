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
    private int sala;
    private boolean temProjetor;
    private boolean temComputadores;
    private int numeroComputador;

    public Sala(int cadeiras, int mesas, int sala, boolean temProjetor, boolean temComputadores, int numeroComputador) {
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.sala = sala;
        this.temProjetor = temProjetor;
        this.temComputadores = temComputadores;
        this.numeroComputador = numeroComputador;
    }

    public boolean Temprojetor() {
        return this.temProjetor;
    }

    public boolean temConmputadores() {
        return this.temComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "cadeiras=" + cadeiras + ", mesas=" + mesas + ", sala=" + sala + ", temProjetor=" + temProjetor + ", temComputadores=" + temComputadores + ", numeroComputador=" + numeroComputador + '}';
    }   
}
