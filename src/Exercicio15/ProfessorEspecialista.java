package Exercicio15;

 class ProfessorEspecialista extends Professor{
      
   private String CursoEspecializado; 

    public String getCursoEspecializado() {
        return CursoEspecializado;
    }

    public void setCursoEspecializado(String CursoEspecializado) {
        this.CursoEspecializado = CursoEspecializado;
    }
   
   @Override
	public void imprimirNome() {
		System.out.println("### Imprimir Informações Especialista###");
                
		System.out.println("Seu nome é: "+this.getNome());
			}
        
        public void imprimeMateria(){
            System.out.println("A Matéria que está sendo lecionada é: "+getCursoEspecializado());
            
        }
   }