package Exercicio01;

import java.util.Objects;

public class Pais {

    private String nome;
    private String capital;
    private double dimensao;
    private Pais[] fronteiras = new Pais[100];
    private int contadorFronteiras = 0;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.capital, other.capital)) {
            return false;
        }
        return true;
    }

    public void addfronteira(Pais pais) {
        if (this.getNome() != pais.getNome()) {
            fronteiras[contadorFronteiras] = pais;
            contadorFronteiras++;
        }
    }

    public boolean verificaFronteira(Pais pais) {

        for (int i = 0; i < contadorFronteiras; i++) {
            if (this.fronteiras[i].getNome() == pais.getNome()) {
                return true;
            }
        }

        return false;
    }

    public Pais[] getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(Pais[] fronteiras) {
        this.fronteiras = fronteiras;
    }

    public Pais[] vizinhosComuns(Pais pais) {
        Pais[] retorno = new Pais[100];
        int contadorDeRetorno = 0;
        for (int i = 0; i < contadorFronteiras; i++) {
            for (int j = 0; j < pais.contadorFronteiras; j++) {
                if (this.fronteiras[i].getNome() == pais.fronteiras[j].getNome()) {
                    retorno[contadorDeRetorno] = this.fronteiras[i];
                }
            }
        }
        return retorno;
    }

}
