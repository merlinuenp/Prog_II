package capitulo_6;


public class Retangulo {
    private int lado1;
    private int lado2;
    
    public Retangulo(){
       lado1 = 0;
       lado2 = 0;
    }
    
    public Retangulo(int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public boolean verificarIgualdade(Retangulo outro){
        if (this.lado1 == outro.getLado1() &&
                this.lado2 == outro.getLado2()){
            return true; 
        }
        return false; 
    }
    
    
    public void setLado1(int lado1){
        this.lado1 = lado1;
    }
    
    public int getLado1(){
        return lado1; 
    }
    
    public void setLado2(int lado2){
        this.lado2 = lado2;
    }
    
    public int getLado2(){
        return lado2; 
    }
}
