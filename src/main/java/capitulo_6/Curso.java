package capitulo_6;


public class Curso {
    public static String universidade; 
    private String nome; 
    
    
    public Curso(){
        nome = "";
    }
    
    public Curso(String nome){
        this.nome = nome; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    
}
