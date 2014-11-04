import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
System.out.println(m);
allBlocks(m);
}
/* *************************
****************************
****************************
*****MY****CODE*************
****************************
****************************
*/
public static int getInt(){
Scanner scan = new Scanner(System.in);//must declare scanner in method
 while(!scan.hasNextInt()){
        scan.nextInt();//checks if its not an int
    }
        return checkInt(scan.nextInt());//sends to check if its in range
    }
public static int checkInt(int toCheck){
    int m = toCheck;
    if(toCheck>9||toCheck<1){//if not in range it will go back to scan it again
        System.out.println("Wrong, 1-9 only.");
        m = getInt();//it will keep looping through itself and getInt until it gets a valid option, there it will allow it to return the input back to the program.
    }
    return m;
}

public static void allBlocks(int big){
    //---------------------------------//
    //This portion of the program is the loop that prints the pyramid in such a way that this program desires
    //This was directly copied and slightly modified from my NumberStack.java file
    //Since NumberStack.java is my program, I am assuming I am allowed to copy from my own written code if it does the exact same thing as what is desired.
    int space = big;
    String spayce = " ";
    String dash = "-";
    for(int num =1; num < big+1; num++){//prints the number that is currently being printed on the pyramid and increments
        for(int x = 0; x < space; x++){//increments to make spaces
            System.out.print(spayce);
            }
        for(int y = 0; y< (num*2)-1; y++){//prints the correct number of digits
            System.out.print(num);
        }
        for(int z = 0; z< space; z++){//prints same number of spaces
            System.out.print(spayce);
        }
        System.out.println();//shifts down and repeats process for dashs instead of numbers
        for(int x = 0; x < space; x++){
            System.out.print(spayce);
            }
        for(int u = 0; u< (num*2)-1; u++){
            System.out.print(dash);
        }
        for(int x = 0; x < space; x++){
            System.out.print(spayce);
            }
        System.out.println();
        space--;//decrements spaces so that a higher number gets less spaces, but more physical digits
        }
}
}
//The only portion of this program that was not written by me is the main program as provided by the homework assignment and was not to by modified.