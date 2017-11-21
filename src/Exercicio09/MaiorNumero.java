
package Exercicio09;

import java.util.Scanner;

public class MaiorNumero {
    
    int numA, numB;
    
    public void maior(){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        numA = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        numB = entrada.nextInt();
        
        
        if(numA > numB)
    
              System.out.println("O Maior número digitado foi: "+numA);
        else
            System.out.println("O Maior número digitado foi: "+numB);
    
    }
    
}
