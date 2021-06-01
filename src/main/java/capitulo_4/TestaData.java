package capitulo_4;

public class TestaData {
    public static void main(String[] args) {
        Data d1 = new Data(); // chamando primeiro construtor
        System.out.println(d1.formatarData("/"));
        
        Data d2 = new Data(2021); //chamando segundo construtor
        System.out.println(d2.formatarData("-"));
        
        Data d3 = new Data(1, 6, 2021);
        System.out.println(d3.formatarDataPlus("/"));
    }
}
