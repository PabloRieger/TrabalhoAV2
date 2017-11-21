package Exercicio11;

public class ParesEImpares {

    int impar;
    int par;

    public void Pares() {
      
		int i, mp, si, totalPar;
		Long par = new Long(0);
		for(i=0; i<30; i++){  
		if(i%2==0){  
		    if(i>2){  
		    par = par*i;  
		    }  
		    else{  
		    par = new Long(i);  
		    }  
		}  
		else{  
		impar = impar+i; 
		}  
		}  
		      System.out.println("Soma dos ímpares é: "+impar);  
		      System.out.println("Multiplicação dos pares é: "+par);  
	}
}
    