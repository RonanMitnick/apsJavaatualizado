/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;

/**
 *
 * @author Matheus
 */
public abstract class Beneficiario {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getnPessoas() {
        return nPessoas;
    }

    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
    private int nPessoas;
    Double renda;
    
    public Beneficiario(String nome,String cpf, int nPessoas, Double renda){
        this.nome = nome;
        this.cpf = cpf;
        this.nPessoas = nPessoas;
        this.renda = renda;
        
    }
    
    
    
}
