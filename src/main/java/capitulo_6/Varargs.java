package capitulo_6;

/**
 * @author jose
 */
public class Varargs {
    public static double calcularMedia(int ... args){
        int soma = 0;
        for(int i=0; i < args.length; i++){
            soma += args[i];
        }
        double media = (double) soma / args.length; 
        return media; 
    }

}
