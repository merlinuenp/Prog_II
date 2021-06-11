package capitulo_4;

public class Cartao {
    int saldo; 
    
    public Cartao(){
        saldo = 10; 
    }    
    
    public void retirar(){
        if (saldo > 0){
            saldo = saldo - 1; 
        }        
    }
    
    public void carregar(int cafes){
        saldo = saldo + cafes; 
    }
    
}



