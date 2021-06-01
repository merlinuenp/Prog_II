package capitulo_4;


public class Data {
    int dia;
    int mes;
    int ano; 
    
    // construtor sem parâmetros
    Data(){
        dia = 1;
        mes = 1;
        ano = 1;
    }
    
    
    Data(int ano){
        this.dia = 1; 
        this.mes = 1;
        this.ano = ano; 
    }
    
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String formatarData(String separador){
        return dia+separador+mes+separador+ano; 
    }
    
    String formatarDataPlus(String separador){
        return String.format("%02d%s%02d%s%d", dia, separador, mes, separador, ano);
    }
    
    
}
