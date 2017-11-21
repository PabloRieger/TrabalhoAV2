/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author Administrador
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Pais brasil = new Pais("Brasil","Brasilia",300);
        
        Pais argentina = new Pais("Argentina","Buenos Aires",500);
        
        Pais paraguai = new Pais("Paraguai","Assunção",500);
        
        
        brasil.addfronteira(paraguai);
        argentina.addfronteira(paraguai);
        
        brasil.verificaFronteira(paraguai);
        
        System.out.println(brasil.verificaFronteira(brasil));
        
        Pais[] fronteiras = brasil.getFronteiras();
        
        Pais[] vizinhos = brasil.vizinhosComuns(argentina);
        for(int i=0; i < vizinhos.length;i++){
            
            
            System.out.println("Paises vizinhos: "+vizinhos[i].getNome());
        
        }
    }
    
    
}
