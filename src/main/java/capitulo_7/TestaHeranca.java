
package capitulo_7;

public class TestaHeranca {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", 2020, 50_000.0);
        Caminhao caminhao = new Caminhao("Volvo", 1990, 100_000.0, 100);
        
        caminhao.getAno(); 
       
    }
}
