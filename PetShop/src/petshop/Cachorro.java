/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author ice
 */
public class Cachorro {  
    private String cor;
    private int idade;
    private String porte;
    
    public Cachorro(String cor, int idade){
        this.cor = cor;
        this.idade = idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPorte(String porte){
        this.porte = porte;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public String getPorte(){
        return porte;
    }
    public int getIdade(){
        return idade;
    } 
}
