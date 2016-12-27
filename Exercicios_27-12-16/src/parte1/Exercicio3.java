package parte1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    int sumSocios = 0, valorVendaCamisolas = 0;
    double valorBilheteira = 0;
    char ticket;
    ArrayList<Character> socios;
    Scanner s;
    
    public Exercicio3(){
        
        socios = new ArrayList<>();
        s = new Scanner(System.in);
        
        System.out.println("Introduza o tipo do sócio (c = com camisola oficial; n = com camisola normal:");
        
        for(int i = 0; i >= 0; i++){
            ticket = s.next().charAt(0);
            if(ticket=='c' || ticket=='n'){
                sumSocios++;
                socios.add(ticket);
                valorBilheteira += 7.5;
            }
            else if(ticket=='s'){
                break;
            }
        }
        
        for(int i = 0; i < socios.size(); i++){
            if(socios.get(i)=='c'){
                valorVendaCamisolas += 14;
            }
        }
        
        System.out.println("Nº de pessoas que compraram ingresso: "+sumSocios);
        System.out.println("Valor angariado na venda de camisolas: "+valorVendaCamisolas+"€");
        System.out.println("Valor angariado na venda de bilhetes: "+valorBilheteira+"€");
    }
}
