package capitulo_4;

public class Main {
    public static void main(String[] v) {
        Cartao cartao = new Cartao();
        System.out.println(cartao.saldo);
        cartao.retirar();
        System.out.println(cartao.saldo);
    }
}
