package intro;

public class Linha {
    int comprimento; 
    
    void desenhar(){
        for(int i=0; i<comprimento; i++){
            System.out.print("_");
        }
        System.out.println("\n\n");
    }
}
