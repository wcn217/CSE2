import java.util.Scanner;
//By Will Nagle
//This program uses scanner
public class BigMac{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the number of Big Macs(an integer greater than zero): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;
        double cost$;
        int dollars, dimes, pennies;
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        dollars=(int)cost$;
        dimes = (int)(cost$*10)%10;
        pennies = (int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+" Big Macs, at $"+bigMac$ +" per Big Mac, with a"+" sales tax of "+ (int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
        
    }
}