package capitulo_4;

public class Lampada {
    boolean acesa;
    String marca; 
    
    Lampada(){
        System.out.println("Executou o primeiro construtor ");
        acesa = false; 
        marca = ""; 
    }
    
    Lampada(String marca){
        System.out.println("Executou o segundo construtor");
        this.acesa = false; 
        this.marca = marca; 
    }
    
    Lampada(boolean acesa){
        this.acesa = acesa; 
        this.marca = "";
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
        if(acesa == true){
            return "acesa";
        }
        else {
            return "apagada"; 
        }
    }
    

}
