/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wolf
 */
public class Forca {
    
    private String palavra;
    private char[] acertos;
    private char[] erros;
    private int tentativas;
    
    public Forca(String  palavra){
        this.palavra = palavra;
        this.acertos = new char[palavra.length()];
        this.erros = new char[5];
        this.tentativas = 0;
        
        for(int i = 0; i < this.palavra.length();i++){
            this.acertos[i] = '_';
        }
    }
    
}
