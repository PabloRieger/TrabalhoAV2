package Exercicio10;

import java.io.InputStream;
import java.util.Scanner;

public class NumeroDecrescente {

    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void Numero() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome um nunmero: ");
        num = entrada.nextInt();

        for (int i = num; i >= 0; i--) {

            System.out.println("A ordem decrescente do numero digitado é: "+i+" ");

        }

    }

}
