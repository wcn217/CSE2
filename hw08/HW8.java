import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
  public static char getInput(Scanner scan, String params){
      while(!scan.next().equals("C")&&!scan.next().equals("c")){//checks if the value entered is equal to the parameters set (asks mutliple times because you cannot use any added variables to only ask once.)
          scan.next();
          System.out.print("This is wrong. Enter C or c.");//displays if incorrect
      }
    
      return scan.next().charAt(0);//returns desired value
  }
  public static char getInput(Scanner scan, String params, int count){
      while(count>0&&!scan.next().equals("Y")&&!scan.next().equals("y")&&!scan.next().equals("N")&&!scan.next().equals("n")){//same checking of parameters like in the first portion method
          System.out.print("This is wrong. Enter Y, y, N, or n. ");
          scan.next();
          count --;
      }
      if(count==0){
          System.out.println("You failed 5 times.");
      }
      return scan.next().charAt(0);
  }
  public static char getInput(Scanner scan, String message, String params){
      System.out.print(message);
     while(!scan.next().equals("1")&&!scan.next().equals("2")&&!scan.next().equals("3")&&!scan.next().equals("4")&&!scan.next().equals("5")&&!scan.next().equals("6")&&!scan.next().equals("7")
     &&!scan.next().equals("8")&&!scan.next().equals("9")){
          System.out.print("Enter a digit!");
          scan.next();
      }
      return scan.next().charAt(0);
  }
}
//Overloading the method made it possible for this program to work. However, having scan.next check for variables without sending any other variables to the method in which to store a counter or any
//potentially valuble variable for use. This means in order to check the contents of scan.next, it needs to be called multiple times.

//Note: This homework wasn't accepted because it was named Hw08 instead of hw8.
