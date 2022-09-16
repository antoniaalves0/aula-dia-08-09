
/* certo */
import java.util.Scanner;
public class Exerc1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        String [] pessoas = new String[10];
        
        for(int i=0; i<pessoas.length; i++){
            System.out.println("digite o nome da pessoa: ");
            pessoas[i] = obj.next();

        }
        int x = (int)Math.random()*10;
        System.out.println(pessoas[x]);
    }
}
