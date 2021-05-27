package intro;


public class Main {
    public static void main(String[] args){
        Linha linha = new Linha();
        linha = new Linha(); 
        linha.comprimento = 10;
        linha.desenhar();
        
        Linha linha2 = new Linha();
        linha2.comprimento = 50;
        linha2.desenhar(); 
    }
  
}
