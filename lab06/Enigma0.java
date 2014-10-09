/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[] args){
    System.out.print("Enter an int- ");
    int n = 0;
    int s = 0;
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      s=1;
      System.out.println("You entered a non int");
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r+s){
      case 25: System.out.println("sum is 25");
      System.out.println("Again, you entered "+n);
      break;
      case 26: System.out.println("Enter an int next time.");
      break;
        
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
    void main(String arg []) should be void main(String[] args)
    safer and better coding to declare int with a value if its print value can change
    based on a if statement
    redeclaring a variable is also bad coding in the else statement and before swtich
    Added variable s to change the switch to aknowledge a non int on case 26
    no reason for a default if the int is not entered so placed with case 24/25
    entered more appropriate responses in the else statement
    breaks in the switch statements
    Removed case 24 becuase that doesnt mean sum is 25.
 */