package _4D_InversãodeDependência;

public class Carro {

    private Motor motor;

    public Carro(Motor m){
        motor=m;
    }

    public void ligar(){
        motor.ligar();
    }
}
