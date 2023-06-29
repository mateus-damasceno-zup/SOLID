package _0S_ResponsabilidadeUnica;

public class CalculadorDeTaxa {


    public double calculadorDeTaxa(Produto produto){
        return produto.getTaxa() * produto.getPreco();
    }


}
