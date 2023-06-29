package _3I_SegregaçãoporInterface;



public class Pinguim implements Aves {
    @Override
    public void setLocalizacao(float lat, float longi) {
        System.out.println("estou na latitude"+ lat +" e longitude "+ longi);
    }

    @Override
    public void bicar() {
        System.out.println("bicou com bico de pinguim");
    }

}
