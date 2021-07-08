

package capitulo_7;

/**
 *
 * @author joser
 */
public class Motocicleta extends Veiculo {
    private Integer cilindradas; 
    
    public Motocicleta(){ 
        cilindradas = 0; 
    }
    
    public Motocicleta(String marca, Integer ano, Double valor, Integer cilindradas){
        super(marca, ano, valor);
        this.cilindradas = cilindradas; 
    }
    
    
    

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    
    
}
