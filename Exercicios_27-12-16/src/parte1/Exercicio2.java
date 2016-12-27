package parte1;

import java.util.ArrayList;

public class Exercicio2 {
    double golos, media = 0, soma = 0;
    ArrayList<Double> arrayGolos;
    
    public Exercicio2(){
        arrayGolos = new ArrayList<>();
        
        arrayGolos.add(2.0);
        arrayGolos.add(1.0);
        arrayGolos.add(0.0);
        arrayGolos.add(3.0);
        
        for (int i = 0; i < arrayGolos.size(); i++){
            soma = soma + arrayGolos.get(i);
        }
        
        media = soma/arrayGolos.size();
        
        System.out.println("Média de golos do avançado por jogo: "+media);
    }
}
