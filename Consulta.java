/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtofinal;

import java.util.Date;

/**
 *
 * @author TBLPimen
 */
public class Consulta {

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the detalhes
     */
    public String getDetalhes() {
        return detalhes;
    }

    /**
     * @param detalhes the detalhes to set
     */
    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
    private Date data;
    private String tipo;
    private String detalhes;
    
    
    
    
    
}
