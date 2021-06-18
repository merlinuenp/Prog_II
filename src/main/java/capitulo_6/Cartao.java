package capitulo_6;

/**
 * Exemplo de modificadores de acesso. 
 * @author jose
 */
public class Cartao {
    private int saldo;
    private String nome; 
    
    public Cartao(){
        this.saldo = 10; 
    }
    
    public void carregar(int unidades){
        this.saldo += unidades; 
    }
    
    public void utilizar(){
        this.saldo--; 
    }
    
    public void utilizar(int unidades){
        this.saldo -= unidades; 
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo; 
    }
   
    public int getSaldo(){
        return saldo; 
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public String getNome(){
        return nome; 
    }

}
