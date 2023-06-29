package _1O_AbertoFechado;

public class FolhaDePagamento {

    private double saldo;

    public void calcular(IRemuneracao funcionario){
        this.saldo = funcionario.remuneracao();
    }
}
