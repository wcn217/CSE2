import java.util.Scanner;
public class Root{
    public static void main (String[] args){
        Scanner fred = new Scanner(System.in);
        System.out.print("Feed me a double and I will give you a cubed root: ");
        double x = fred.nextDouble();
        double guess = x/3;
        for(int z=0; z<100; z++)//Have taken Java before, repeating this step 100 times makes it almost 100% accurate.
        {
        guess = (2*guess*guess*guess+x)/(3*guess*guess);
        }
        double guessTotal = guess*guess*guess;
        System.out.println("The cube root is: "+guess);
        System.out.println(guess+" x "+guess+" x "+guess+" = "+guessTotal);
    }
}