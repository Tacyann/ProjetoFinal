/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtofinal;

/**
 *
 * @author TBLPimen
 */
public class Dentista implements Pessoa {

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }
    
    public Dentista(String matricula){
        this.matricula = this.matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public  String nome;
    public int CROSP;
    private int matricula;
    

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setCROSP(int novoCROSP) {
        CROSP = novoCROSP;
    }

    public int getCROSP() {
        return CROSP;
    }
                       // a matricula q vc esta passando como parametro ou seja matric

    @Override
    public void incluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

