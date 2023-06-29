package _2L_SubstituiçãodeLiskov;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        imprimiNome(a);
        imprimiNome(b);
    }

    private static void imprimiNome(A classe) {
        System.out.println(classe.getNome());
    }
}
