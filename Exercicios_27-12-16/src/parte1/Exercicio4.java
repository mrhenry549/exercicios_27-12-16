package parte1;

import java.util.ArrayList;

public class Exercicio4 {
    ArrayList<Integer> arrayNumeros;
    int produto = 1;
    
    public Exercicio4(){
        arrayNumeros = new ArrayList<>();
        
        arrayNumeros.add(5);
        arrayNumeros.add(2);
        arrayNumeros.add(7);
        
        for(int i = 0; i < arrayNumeros.size(); i++){
            produto *= arrayNumeros.get(i);
        }
        
        System.out.println("Resultado do produto: "+produto);
    }
}
