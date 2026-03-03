/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gabrielabueno;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    
    public Estudante(){
        this.nome = "Nenex";
    }
   
    
    public Date obterData() {
        return this.dataNascimento;
    }
    public String getNome(){
        return this.nome;
        
    }
    public void setNome (String _nome){
        this.nome = _nome;
    }
        
        
}
