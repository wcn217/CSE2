import java.util.Scanner;
//By Will Nagle
//This program uses scanner
//This program allows you to accept a time in seconds as a input and outputs the time.
public class TimePadding{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);//declares scanner
    System.out.print("Give me a time in seconds: ");//prompts user
    if(myScanner.hasNextInt()){//checks if its an Int
        int time = myScanner.nextInt();//accepts user input
        if(time<0){
            System.out.println("You cannot have negative time!");//Checks for a negative time
        }
        else{
            int FHours = time/3600;//finds #of hours by dividing by seconds in an hour
            time = time-(FHours*3600);//subtracts any hours found
            int FMinutes = time/60;//finds minutes by dividing remaining seconds by seconds in minute
            time = time-(FMinutes*60);//subtracts any minutes found
            int FSeconds = time;//remaining seconds
            String minutes, secondsP, hours;//strings to be printed
            if(FMinutes<10){
                minutes = "0"+FMinutes;//padding
            }
            else{
                minutes = ""+FMinutes;//no padding if 2 digit #
            }
            if(FSeconds<10){
                secondsP = "0"+FSeconds;//padding
            }
            else{
                secondsP = ""+FSeconds;//no padding for 2 digit
            }
            if(FHours<10){
                hours = "0"+FHours;//padding
            }
            else{
                hours = ""+FHours;//no padding for 2 digit, but allows it to be over 2 digits
            }
            System.out.println("The time is "+hours+":"+minutes+":"+secondsP);//output
        }
    }
    else{
        System.out.println("Enter an integer next time.");//error message if no int
    }
    }
}