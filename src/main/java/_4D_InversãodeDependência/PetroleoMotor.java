package _4D_InversãodeDependência;

public class PetroleoMotor implements Motor{
    @Override
    public void ligar() {
        System.out.println("ligou o motor de petroleo");
    }
}
