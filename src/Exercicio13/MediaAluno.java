
package Exercicio13;

import java.util.Scanner;

public class MediaAluno {
    
     int notas[];
     int entradaQuantidadeNotas;
     float media;

    public int getEntradaQuantidadeNotas() {
        return entradaQuantidadeNotas;
    }

    public void setEntradaQuantidadeNotas(int entradaQuantidadeNotas) {
        this.entradaQuantidadeNotas = entradaQuantidadeNotas;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
     
    
       public void cadastrarNotas(){
       
        System.out.println("Informe a quantidade de notas:");
        entradaQuantidadeNotas = new Scanner(System.in).nextInt();
        
        
        notas = new int[entradaQuantidadeNotas];
        
     
        for(int i=0 ; i < entradaQuantidadeNotas ; i++){
            
            System.out.println("Informe a " +(i+1)+ "ª nota");
            notas[i] = new Scanner(System.in).nextInt();
            if (notas[i] > 100){ 
            System.out.println("A nota digitada não é Válida! Digite uma nota de 0 a 100.");
            break;}
      }
        }
     
            
       public void MediaNotasAlunos(){  
                  
        for(int i=0 ; i <entradaQuantidadeNotas ; i++){
            media = media + notas[i];
        }
        media = media / entradaQuantidadeNotas;
        System.out.println ("A média é              : " +media);
        
       
        }
       
}

  