import java.util.Scanner;
//By Will Nagle
//This program uses scanner
//This program allows you to accept an int and give the value in thousands and calculate the income tax.
public class IncomeTax{
    public static void main(String[] args){
        Scanner ohBoy;//Declares a scanner
        ohBoy = new Scanner(System.in);//Scanner named ohBoy
        System.out.print("Give me a interger and I will give you the income tax: ");//Looking for Int
        int theMoney;
        if(ohBoy.hasNextInt()){//Checks if its an Int
        theMoney = ohBoy.nextInt();
        if(theMoney<0){//Checks if its more than 0
            System.out.println("Enter an integer more than 0!");
            return;
        }
        else
        {
            theMoney = theMoney*1000;//Raises money to the thousands
            double tax;
            double taxForPrint;//Tax for calculation and tax for printing to the user
            if(theMoney<=20000){
                tax = 0.05;
                taxForPrint = 5.0;
            }
            else if (theMoney>=20000&&theMoney<40000){//Each if/elseif selects which tax to use based on the value recieved.
                tax = 0.07;
                taxForPrint = 7.0;
            }
            else if (theMoney>=40000&&theMoney<78000){
                tax = 0.12;
                taxForPrint = 12.0;
            }
            else {
                tax = 0.14;
                taxForPrint = 14.0;
            }
            double taxedMoney = tax*theMoney;//multiplies the tax on the end
            System.out.println("The tax rate on $"+theMoney+" is "+taxForPrint+"%, and the tax is $"+taxedMoney);//displays desired result
        }
        }
        else{
            System.out.println("Enter an integer next time!");//check when its not an int
        }
        
    }
}