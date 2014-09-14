import java.util.Scanner;
public class Bicycle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of counts: ");
        int counts = input.nextInt();
        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();
        double pi = 3.14159;
        int feetPerMile=5280;
        int inchesPerFoot=12;
        int secondsPerMinute=60;
        double wheelDiameter=27.0;
        double distance;
        double speed;
        double time = seconds/secondsPerMinute;
        distance=counts*wheelDiameter*pi;
        distance/=inchesPerFoot*feetPerMile;//now is in miles
        speed=distance/(time/60);
        System.out.println("The distance was "+distance+" miles and took "+time+" minutes.");
        System.out.println("The average mph was "+speed);
    }
}