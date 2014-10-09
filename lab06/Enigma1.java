/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String[] args){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner scan = new Scanner(System.in);
    double x = scan.nextDouble();
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   if(x==7.0){  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
   }
    else if(x==41.0){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(x==14.0){//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    }
    else if(x==33.0){//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    }
    else if(x==60.0){//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
    }
    else{
        System.out.println("This doesn't work.");
    }
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
    Once again, fixed string args to be proper
    declared scanner
    simplified complex if check, 1-x/100==## can only be fufilled by one x value
    not multiple.
    prints error when its not an acceptable double.
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *  Any value that is not a double or any value that is not 7,41,14,33, or 60.
 *  
 * 
 * 
 */