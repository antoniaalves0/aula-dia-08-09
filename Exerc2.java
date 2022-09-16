/* certo */ 
import javax.swing.JOptionPane;

public class Exerc2 {
    public static void main(String[] args) {
        int [] nums = new int [1000];
        
        for (int i = 0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*1000);
            System.out.println(nums[i]);
        }

        
        for (int i = 0; i<nums.length; i++){
            i = Integer.parseInt(JOptionPane.showInputDialog("digite um numero pra ser pesquisado noarray:"));
            if (nums[i]==i){
                JOptionPane.showMessageDialog(null, "O numero existe no array");
            }else {
                JOptionPane.showMessageDialog(null, "O numero NAO existe no array");
                

            }
        }
        




    }
}
