package _0S_ResponsabilidadeUnica;

public class Produto {

    private String produto;
    private double preco;
    private double taxa;


    public Produto(String produto, double preco, double taxa) {
        this.produto = produto;
        this.preco = preco;
        this.taxa = taxa;
    }

    public double getPreco() {
        return preco;
    }

    public double getTaxa() {
        return taxa;
    }

}
