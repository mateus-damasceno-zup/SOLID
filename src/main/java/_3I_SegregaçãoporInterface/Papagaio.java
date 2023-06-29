package _3I_SegregaçãoporInterface;

public class Papagaio implements AvesQueVoam{
    @Override
    public void setLocalizacao(float lat, float longi) {
        System.out.println("estou na latitude"+ lat +" e longitude "+ longi);
    }

    @Override
    public void bicar() {
        System.out.println("bicou com bico de papagaio");
    }

    @Override
    public void setAltitude(float altitude) {
        System.out.println("voei até: "+ altitude+"m");
    }

}
