package capitulo_4;

public class Lampada {
    boolean acesa;
    String marca; 
   
    Lampada(){
        acesa = false; 
        marca = ""; 
    }
    
    Lampada(boolean acesa){
        this.acesa = acesa;
        marca = ""; 
    }
    
    Lampada(boolean acesa, String marca){
        this.acesa = acesa; 
        this.marca = marca; 
    }
    
    
    
    void acender(){
        acesa = true;
    }
    
    void apagar(){
        acesa = false; 
    }
    
    String mostrarEstado(){
        if (acesa == true){
            return "acesa"; 
        }
        else{
            return "apagada";
        }
    }

    

    

}
