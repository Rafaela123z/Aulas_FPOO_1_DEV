/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades.atividade01;

import javax.annotation.processing.Messager;



/**
 *
 * @author Aluno
 */
public enum EnumMeses {
    JANEIRO("Janeiro"), FEVEREIRO("Fevereiro"), MARCO("Março"), ABRIL("Abril"), MAIO("Maio"), JUNHO("Junho"), JULHO("Julho"), AGOSTO("Agosto"), SETEMBRO("Setemebro"), OUTUBRO("Outubro"), NOVEMBRO("Novembro"), DEZEMBRO("Dezembro");
private String mes;

    private EnumMeses(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

}

