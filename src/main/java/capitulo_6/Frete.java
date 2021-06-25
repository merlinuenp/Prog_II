package capitulo_6;

public class Frete {
    
    public static double calcularFrete(String cep, double valor){
        String regiao = obterRegiao(cep);
        if (regiao.equalsIgnoreCase("Norte")){
            return valor * 0.05; 
        }
        else if (regiao.equalsIgnoreCase("Nordeste")){
            return valor * 0.04; 
        }
        else if (regiao.equalsIgnoreCase("Centro-Oeste")){
            return valor * 0.04; 
        }
        else if (regiao.equalsIgnoreCase("Sudeste")){
            return valor * 0.03; 
        }
        else if (regiao.equalsIgnoreCase("Sul")){
            return valor * 0.02; 
        }
        return  0.0;  
    }
    
    private static String obterRegiao(String cep){
        char primeiraLetra = cep.charAt(0); 
        switch(primeiraLetra){
            case '1': case '2': case '3': return "Sudeste";
            case '4': case '5': return "Nordeste"; 
            case '6': return "Centro-Oeste"; 
            case '7': return "Norte";
            case '8': case '9': return "Sul";
        }
        return null;
    }
    
}
