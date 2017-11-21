
package Exercicio15;

public class ProfessorMestre extends Professor{
    
    private String cursoMestrado;

    public String getCursoMestrado() {
        return cursoMestrado;
    }

    public void setCursoMestrado(String cursoMestrado) {
        this.cursoMestrado = cursoMestrado;
    }

    @Override
    public void imprimirNome() {
            System.out.println("##INFORMAÇÕES CURSO MESTRADO##");
            System.out.println("Seu nome é: "+this.getNome());
             System.out.println("Seu curso é: "+this.getCursoMestrado());
    }
    
   
}
