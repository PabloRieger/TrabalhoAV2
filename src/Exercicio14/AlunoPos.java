
package Exercicio14;

public class AlunoPos extends Aluno{

     @Override
    public void imprimeNome() {
         System.out.println("##INFORMAÇÕES##");
        System.out.println("Seu nome é: "+this.getNome());
        
    }

    @Override
    public void imprimeEndereco() {
        System.out.println("Seu endereço é: "+this.getEndereco());
    }
    
}
