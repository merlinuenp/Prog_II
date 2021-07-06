package capitulo_6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Horas {

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fim = LocalDateTime.now();       
        long diferenca = inicio.until(fim, ChronoUnit.SECONDS);
        
        System.out.println(diferenca);
    }
}
