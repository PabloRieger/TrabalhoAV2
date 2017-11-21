
package Exercicio14;

public class PessoaApp {
   
	public static void main(String[] args) {
		Pessoa cp = new Aluno() {};
		cp.setNome("Pablo");
		cp.setEndereco("Rua Arisoli Ribeiro, 251");
                cp.imprimeNome();
                cp.imprimeEndereco();
                          
                
                Aluno pos = new AlunoPos();
                pos.setNome("Juliana");
                pos.setEndereco("Rua Arisoli Ribeiro");
                pos.imprimeNome();
                pos.imprimeEndereco();
                
                
	}
    
        
                
}
