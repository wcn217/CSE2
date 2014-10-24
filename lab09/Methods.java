import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
                   	
    
  }
public static int getInt(Scanner scan){
    while(!scan.hasNextInt()){
        scan.nextInt();
    }
        return scan.nextInt();
    }
    public static int larger(int one,int two){
        int bigger = 0;
        if(one>two){
            bigger = one;
        }
        else{
            bigger = two;
        }
        return bigger;
    }
    public static boolean ascending(int uno,int dos,int tres){
        return uno>dos&&dos>tres;
    }
}
//This method program was written by Will Nagle
//It has 3 seperate methods that are referred to and returns ints and a boolean to the main program.