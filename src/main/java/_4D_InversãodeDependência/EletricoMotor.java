package _4D_InversãodeDependência;

public class EletricoMotor implements Motor{
    @Override
    public void ligar() {
        System.out.println("...\n ligou o motor eletrico");
    }
}
