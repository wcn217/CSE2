import java.util.Scanner;
//By Will Nagle
//This program uses scanner
//This program allows you to accept fries as part of the order using a char.
public class BigMacAgain{
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);//Decalre and import scanner
        double bigMacCost = 2.22;
        double friesCost = 2.15;
        double total = 0.00; //Declaring the total and costs of both items.
        System.out.print("Welcome to McDonalds! How many Big Macs do you want?(Positive Int): ");//ASking the question to be sent to the int, numMacs
        int numMacs;
        if(myScanner.hasNextInt()){//checks if its an Int
            numMacs = myScanner.nextInt();
            if(numMacs<=0){//checks for negative
                System.out.println("You cannot do that. I need more than 0.");
            }
            else{//only reaches this if its not negative or not an int
            total = numMacs*bigMacCost;
            System.out.println("You ordered "+numMacs+" Big Macs for $"+total);
            System.out.println("You want fries? (Y,y,n,N)");//declares values calculated and then asks for fries
            String answer = myScanner.next();
            if(answer.equals("Y")|| answer.equals("y")){//checks for upper/lowercase Y
                total=total+friesCost;
                System.out.println("Your order comes to $"+total);
            }
            else if(answer.equals("N")|| answer.equals("n")){//Same for N
                System.out.println("Your order comes to $"+total);
            }//Y or N produce same value except with the difference of adding the fry cost
            else{
                System.out.println("Enter Y,y,N, or n next time.");//The checker for a valid Y or N and not another string
            }
        }
        }
        else{
            System.out.println("Give me an Int more than 0 next time.");//The result of declaring a non int or negative num
        }
        //This compiler accasionally gets in the bad habit of adding .00000000001 to the double for some bizzarre reason. It does it only sometimes and is purely a compiler glitch, not in code.
    }
}