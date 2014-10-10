/* This program is by Will Nagle
This program prints stars based off of a int value that is recieved
the the scanner.
*/ 
import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String[] args){
        String response = "Y";//Starts response as yes so the while loop starts
        Scanner scan = new Scanner(System.in);//declare scanner
        while(response.equals("Y")||response.equals("y")){//checks for yes
        int nStars = 0;//Number of first printed loop
        int nBars = 0;//number of rows
        int print = 1; //prints the first line
        char star = '*';//char to print
        int nStar; //int to be recieved by user to pick how many rows
        System.out.print("Enter an int between 1 and 15- ");//prompts user
        if(scan.hasNextInt()){//checks for int
            nStar=scan.nextInt();//accepts input
            if(nStar<1||nStar>15){//makes sure its within range
                System.out.println("Your int was not in the range [1,15]");//error message for failed range
            }
        else{
            while(print<=nStar){
                System.out.print(star);
                print++;//prints the first line of stars equal to the int entered
            }
            while (nBars<=nStar){//counter in while loop to keep it under the input
                while(nStars<nBars){//counter to print amount under the counted row
                    System.out.print(star);
                    nStars++;
                                }
                System.out.println();
                nBars++;
                nStars = 0;//resets to zero before going back
                        }
                }
                }
        System.out.println("Do you want to go again? (Y or y for yes.)");//prompts to reset
        response = scan.next();//if yes it returns, anything else it doesnt
        }
        
    }
}