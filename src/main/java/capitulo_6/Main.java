package capitulo_6;

public class Main {

    public static void main(String[] args) {
        Cartao c = new Cartao();
        c.setSaldo(100);
        c.utilizar();
        System.out.println(c.getSaldo());
        c.utilizar(10);
        System.out.println(c.getSaldo());

    }

}
