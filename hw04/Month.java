import java.util.Scanner;
//By Will Nagle
//This program uses scanner
//This program allows you to accept a month as an input and an optional year input and outputs number of days
public class Month{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declares scanner
        System.out.print("Which month do you wish to know? (1-12)");//prompts user
        int month;
        if(myScanner.hasNextInt()){//checks if its an Int
            month = myScanner.nextInt();//input from user prompt
            if(month<1||month>12){
                System.out.println("Thats funny, never knew there was a "+month+"th month...\nTry Again.");//insults user and then states that the inputed int was incorrect
                return;//leaves and finishes program
            }
            else{
                //The next if/else statements check to see if the remainder left from a value is 1 or 0 and checks if its the month is more than 7 or not. 
                //If the month is more than 7 and has a remainder, it is the months after July that are odd, which have 30 days
                //more than 7 and no remainder gives even months with 31 days
                //less than or equal to 7 with no remainder is an even number month earlier than July with 30 days
                //less than or equal to 7 with remainder is an odd month with 31 days before August
                int monthCheck = month%2;
                if (month==2){
                    monthCheck=2;//Feb check
                }
                if ((monthCheck==1&&month<=7)||(monthCheck==0&&month>7)){
                    System.out.println("The number of days in this month is 31");
                }
                else if((monthCheck==1&&month>7)||(monthCheck==0&&month<=7)){
                System.out.println("The number of days in this month is 30");
                }
                else
                {
                    System.out.print("What year? (dddd)");//asks for the year if february
                    int year = myScanner.nextInt(),
                    fourCheck = year%4,//Gregorian calendar leap year check
                    hundredCheck = year%100,
                    fourHCheck = year%400;
                    if (fourCheck==0&&hundredCheck!=1){//If its divisible by 4 and not by 100 its a leap year
                        System.out.println("The number of days in this month is 29");
                    }
                    else if (fourCheck==0&&fourHCheck==0){//If its divisible by 4 and 400 its a leap year
                        System.out.println("The number of days in this month is 29");
                    }
                    else{//Anything else is not a leap year
                        System.out.println("The number of days in this month is 28");
                    }
                    
                }
            }
            
        }
        else{
            System.out.println("That's not an Int, its a sandwich.");//Check for if the int recieved is not an int.
        }
    }
}