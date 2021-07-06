
package capitulo_6;

import static java.util.stream.IntStream.rangeClosed;

public class TestaFrete {
    public static void main(String[] args) {
        int num = 5;
        long result = rangeClosed(1, num)
                .reduce(1, (a, b)-> a * b); 
        System.out.println(result);
    }

}
