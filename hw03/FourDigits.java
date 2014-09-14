import java.util.Scanner;
public class FourDigits{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Feed me a double: ");
        double digits = input.nextDouble();
        int first,second,third,fourth;
        first=(int)(digits*10)%10;
        second=(int)(digits*100)%10;
        third=(int)(digits*1000)%10;
        fourth=(int)(digits*10000)%10;
        System.out.println("The first four digits after the decimal are: "
        +first+""+second+""+third+""+fourth);
    }
}