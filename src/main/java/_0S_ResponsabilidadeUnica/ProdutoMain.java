package _0S_ResponsabilidadeUnica;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = new Produto("pedra de estimacao",55,0.1);
        CalculadorDeTaxa calcTaxa = new CalculadorDeTaxa();
        double tributo =calcTaxa.calculadorDeTaxa(produto);
        System.out.println("valor da taxa D$ "+tributo);


    }
}
