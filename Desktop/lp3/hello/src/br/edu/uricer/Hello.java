/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

/**
 *
 * @author Aluno
 */
public class Hello {
    
    private String nome = "";
    
    public Hello(){
    }
    
    public Hello(String nome) {
        this.nome = nome;
    }
    
    public String getMessage(){
        return("Hello " + nome).trim();
    }
    
}
