/* */
import java.util.Scanner;
public class Exerc3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);

        String [] nomes = new String [5];
        String [] sexo = new String [5];

        for (int i= 0; i<nomes.length; i++){
            System.out.println("digite o nome : ");
            nomes[i] = obj.next();


        }
        for (int i= 0; i<sexo.length; i++){
            System.out.println("digite o sexo : ");
            sexo[i] = obj.next();


        }
        

            System.out.println("O sexo é:"+ nomes[0] + "é" + sexo [0]);
            System.out.println("O sexo de :"+ nomes[1] + "é" + sexo [1]);
            System.out.println("O sexo de :"+ nomes[2]+ "é" + sexo [2]);
            System.out.println("O sexo de :"+ nomes[3] + "é" + sexo [3]);
            System.out.println("O sexo de :"+ nomes[4] + "é" + sexo [4]);

     
            

        


       
        }
    }


