package capitulo_4;

import java.util.Scanner;

/**
 * Classe para exemplificar arrays. 
 * @author José
 */
public class Vetor {

    public static void main(String[] args) {
        Veiculo veiculos[] = new Veiculo[3]; // instanciando um vetor de 3 elementos
        veiculos[0] = new Veiculo("Ford", "ABC4R3"); // instancia um objeto Veiculo e atribui à posição 0
        veiculos[1] = new Veiculo("Fiat", "CBA4R3");
        veiculos[2] = new Veiculo("BMW", "XYZ2E7");
       
        // exibindo os elementos
        for(int i=0; i < veiculos.length; i++){
            System.out.println("Marca: " + veiculos[i].marca);
        }
       
       
       
    }
}
