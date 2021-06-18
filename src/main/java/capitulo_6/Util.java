package capitulo_6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author joser
 */
public class Util {

    
    public static String formatarData(LocalDate data) {
        return (data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
