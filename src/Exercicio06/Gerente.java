package Exercicio06;

abstract class Gerente extends Funcionario{
    
    private Funcionario[] funcionario;
    private Double bonus;

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    
    
}
