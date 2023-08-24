/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes.atividades;



/**
 *
 * @author Aluno
 */
public enum MemoriaEnum {
   DDR("Double Data Rate"), DDR2("Double Data Rate 2"), DDR3("Double Data Rate 3"), DDR4("Double Data Rate 4");

private String tipoMemoria;

    private MemoriaEnum(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }


}
