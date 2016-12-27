package parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio5 {

    int numero;
    ArrayList<Integer> numerosPrimos;

    Scanner s;

    public Exercicio5() {

        s = new Scanner(System.in);
        numerosPrimos = new ArrayList<>();

        System.out.println("introduza um número inteiro qualquer:");

        numero = s.nextInt();

        for (int i = 1; i <= numero; i++) {
            int cont = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    cont = cont + 1;
                }
            }
            if (cont == 2) {
                numerosPrimos.add(i);
            }
        }

        System.out.println("Números primos até " + numero + ":");

        for (int i = 0; i < numerosPrimos.size(); i++) {
            System.out.println(numerosPrimos.get(i));
        }
    }
}
