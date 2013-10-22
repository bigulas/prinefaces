/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author aluno
 */
@ManagedBean
@SessionScoped
public class TesteController {

    String nome;
    int idade;
    int num1;
    int num2;
    int result;
    
    /**
     * Creates a new instance of TesteController
     */
    public TesteController() {
    }
    
    public int soma(){
        result = num1+num2;
        return result;
    }
    
    public void teste(){
        nome = "teste";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
