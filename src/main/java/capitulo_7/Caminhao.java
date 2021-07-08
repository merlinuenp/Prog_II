package capitulo_7;

import java.time.LocalDate;

public class Caminhao extends Veiculo {
    private Integer capacidadeCarga; 
    
    public Caminhao(){
        super();
        capacidadeCarga = 0; 
    }
    
    public Caminhao(String marca, Integer ano, 
            Double valor, Integer capacidadeCarga){
        super(marca, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public Double calcularIpva(){
        Integer anoAtual = LocalDate.now().getYear(); // ano do sistema
        if( anoAtual - getAno() > 20){
            return 0.0;
        }
        return getValor() * 0.04; 
    }
    
    
    public void setCapacidadeCarga(Integer capacidadeCarga){
        if (capacidadeCarga < 0){
            return; 
        }
        this.capacidadeCarga = capacidadeCarga; 
    }
    
    public Integer getCapacidadeCarga(){
        return capacidadeCarga;
    }
}
