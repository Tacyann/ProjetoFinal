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
public class Secretaria implements Pessoa{

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    
     
    public Secretaria(String matricula){
        this.matricula = this.matricula;
    }
    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    private String nome;
    private int registro;
    private int matricula;
    
    
  public Secretaria(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    } 
  
  public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setRegistro(int novoRegistro) {
        registro = novoRegistro;
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

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
