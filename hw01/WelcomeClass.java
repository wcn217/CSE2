import java.util.Scanner;
public class WelcomeClass{
    public static void main(String[] args){
        System.out.println("-----------");
        System.out.println("| WELCOME |");
        System.out.println("-----------");
        System.out.println("  ^  ^  ^  ^  ^  ^");
        System.out.println("/ \\ / \\ / \\ / \\ / \\ ");
        System.out.println("|-W--C--N--2--1--7-|");
        System.out.println("\\ /\\ /\\ /\\ /\\ /\\ /");
        System.out.println(" v   v   v   v   v   ");
        
        for (int i = 6; i>0; i--){
            for(int k = i-2; k>0; k--){
                int j = 0;
                do{
                    System.out.print(i);
                    j++;
                }while(j<k);
                System.out.println();
            }
        }
        int l = 2;
        while(l>0){
            System.out.println(l);
            l--;
        }
    }
}
