
package Exercicio06;

abstract class Funcionario extends Pessoa{
   
    private int n_cadastro_emp;
    private double salario;

    public int getN_cadastro_emp() {
        return n_cadastro_emp;
    }

    public void setN_cadastro_emp(int n_cadastro_emp) {
        this.n_cadastro_emp = n_cadastro_emp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
