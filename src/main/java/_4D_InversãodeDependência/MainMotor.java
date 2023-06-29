package _4D_InversãodeDependência;

public class MainMotor {
    public static void main(String[] args) {
        Motor eletrico = new EletricoMotor();
        Carro tesla = new Carro(eletrico);

        Motor gasolina = new PetroleoMotor();
        Carro challenger = new Carro(gasolina);

        challenger.ligar();
        tesla.ligar();
    }
}
