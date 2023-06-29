package _1O_AbertoFechado;

public class MainO {
    public static void main(String[] args) {
        IRemuneracao clt = new ContratoCLT();
        FolhaDePagamento fp = new FolhaDePagamento();
        fp.calcular(clt);
        System.out.println(clt.remuneracao());

    }
}
