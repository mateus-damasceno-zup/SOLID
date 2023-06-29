package _3I_SegregaçãoporInterface;

public class MainAves {
    public static void main(String[] args) {
        AvesQueVoam curupacu = new Papagaio();
        Aves gilberto = new Pinguim();

        curupacu.bicar();;
        curupacu.setLocalizacao(44,33);
        curupacu.setAltitude(33);
        gilberto.setLocalizacao(22,4444);

    }
}
