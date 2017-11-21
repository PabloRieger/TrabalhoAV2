
package Exercicio12;

import java.util.Scanner;

public class TrocaNumero {
  
   int numA; 
   int numB;
           
    public void troca(){
       
       
       System.out.println("Informe o primeiro numero: ");
       numA = new Scanner(System.in).nextInt();
        
        System.out.println("Informe o segundo numero: ");
       numB = new Scanner(System.in).nextInt();
        
        System.out.println("A ordem inversa dos numeros digitados são: "+numB+" "+numA);
    
    }
}
