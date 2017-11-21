
package Exercicio08;

import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

/*Crie uma classe chamada Endereco que possua uma String rua e outra cep. Use o
conceito de Encapsulamento para armazenar o valor de um cep de forma que a
String que corresponda ao número do cep fique sempre no formato: “XXXXXXXX”
onde X representa um número de 0 a 9.
*/
public class Endereco {
    
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    public void validar(){
                 
      System.out.println("O Cep informado foi: "+getCep());
      
      System.out.println("Seu CEP em formato Inteiro é: "+Integer.parseInt(this.getCep()));
       
        
    }
    
}
