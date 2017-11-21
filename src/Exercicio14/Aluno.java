
package Exercicio14;


public class Aluno extends Pessoa{

    @Override
    public void imprimeNome() {
        System.out.println("### INFORMAÇÃO ###");
        System.out.println("Seu nome é: "+this.getNome());
        
    }

    @Override
    public void imprimeEndereco() {
        System.out.println("Seu endereço é: "+this.getEndereco());
    }
   
}
