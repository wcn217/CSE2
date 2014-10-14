import java.util.Scanner;
//This program uses a while loop to compute a square root
//By Will Nagle
public class Root{
    public static void main(String[] args){
        int guessTimes = 10000; //factor of .0000001
        int counter = 0;
        double lower = 0;
        double numberManip, numberCompare;
        System.out.print("Feed me a number and I will give you the square root: ");
        Scanner myScanner = new Scanner(System.in);
        double number = myScanner.nextDouble();
        numberManip = number+1;
        double highest = number+1;
        while(counter<guessTimes){
            numberManip = numberManip/2;
            numberCompare = numberManip*numberManip;
            if(numberCompare<number){
                lower = numberManip;
                numberManip = numberManip+1;
            }
            else{
                highest = numberCompare;
                numberManip = numberManip+1;
            }
            counter++;
            
        }
        double value = (highest+lower)/2;
        System.out.println("The square root is: "+value);
    }
}