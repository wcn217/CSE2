import java.util.Scanner;
public class WelcomeClass{
    public static void main(String[] args){
        System.out.println("-----------");
        System.out.println("| WELCOME |");
        System.out.println("-----------");
        System.out.println("  ^  ^  ^  ^  ^  ^");
        System.out.println("/ \\ / \\ / \\ / \\ / \\ ");
        System.out.println("|-W--C--N--2--1--7-|");
        System.out.println("\\ /\\ /\\ /\\ /\\ /\\ /");
        System.out.println(" v   v   v   v   v   ");
        Scanner scan = new Scanner(System.in);
        if (scan.next().charAt(0)!='c'){
            scan.next();
            System.out.println("Java is an absolute moron.");
        }
        else{
            System.out.println("Java is smart.");
        }
    }
}
