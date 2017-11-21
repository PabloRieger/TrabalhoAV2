
package Exercicio15;

public class ProfessorApp {
    
    public static void main(String[] args) {
        
        Professor cp = new ProfessorEspecialista(){}; 
           cp.setNome("Pablo");
           cp.imprimirNome();
           
       ProfessorEspecialista prof = new ProfessorEspecialista() {};
           prof.setCursoEspecializado("Programação");
           prof.imprimeMateria();
           
       ProfessorMestre mestre = new ProfessorMestre(){};
            mestre.setNome("Jão");
            mestre.setCursoMestrado("Portugol");
            mestre.imprimirNome();
           
}  
} 
