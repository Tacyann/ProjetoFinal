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
public class Paciente {
        
        private String nome;
        private String telefone;
        private String endereco;
        
    public Paciente(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void setTelefone(String novoNome) {
        nome = novoNome;
    }
    
    public void getTelefone(String novoNome) {
        nome = novoNome;
    }


    public String getNome() {
        return nome;
    }


    
}
