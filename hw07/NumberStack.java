import java.util.Scanner;
//This program prints a pyramid of numbers and stuff
//Yay
//By Will Nagle
public class NumberStack{
    public static void main(String[] args){
        Scanner henrik = new Scanner(System.in);
        //for loop option
        boolean end = true;
    while(end){
        System.out.print("Enter a int between 1 and 9: ");//asks user for response
        if(henrik.hasNextInt()){//checks if its an int
        int response = henrik.nextInt();//input here
        int space = response;//number of spaces on both sides initially is the size of the inputted number to account for spaces for lower numbers.
        String dash = "-";//dash
        String spayce = " ";//open spaces to print
        System.out.println();
        if(response<=9&&response>=1){//only depends on response being between 1 and 9
        for(int num =1; num < response+1; num++){//prints the number that is currently being printed on the pyramid and increments
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
        end = false;//finishes the overall while loop
        }
        else{
            System.out.println("Enter a valid number next time.");//check if its not within 1-9
        }
    }
    
    else{
        System.out.println("Not an int.");//ends if a non int is entered
        return;
    }
    }
    //while loop option
    end = true;
    while(end){
        System.out.print("Enter a int between 1 and 9: ");
        if(henrik.hasNextInt()){
        int response = henrik.nextInt();
        int space = response;
        String dash = "-";
        String spayce = " ";
        int num = 1;
        System.out.println();
        if(response<=9&&response>=1){
        while(num < response+1){
            int x = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int y = 0;
            int u = 0;//in a while and do while loop, the variables must be declared beforehand but still within the loops to have the same effect.
        while(x < space){
            System.out.print(spayce);
            x++;
            }
        while(y< (num*2)-1){
            System.out.print(num);
            y++;
        }
        while(a < space){
            System.out.print(spayce);
            a++;
            }
        System.out.println();
        while(b < space){
            System.out.print(spayce);
            b++;
            }
        while(u< (num*2)-1){
            System.out.print(dash);
            u++;
        }
        while(c < space){
            System.out.print(spayce);
            c++;
            }
        System.out.println();
        space--;
        num++;
        }
        end = false;
        }
        else{
            System.out.println("Enter a valid number next time.");
        }
    }
    else{
        System.out.println("Not an int.");
        return;
    }
    }
    //do while loop option
    end = true;
    while(end){
        System.out.print("Enter a int between 1 and 9: ");
        if(henrik.hasNextInt()){
        int response = henrik.nextInt();
        int space = response;
        String dash = "-";
        String spayce = " ";
        int num = 1;
        System.out.println();
        if(response<=9&&response>=1){
        do{
            int x = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int y = 0;
            int u = 0;
        do{
            System.out.print(spayce);
            x++;
            }while(x < space);
        do{
            System.out.print(num);
            y++;
        }while(y < (num*2)-1);
        do{
            System.out.print(spayce);
            a++;
            }while(a < space);
        System.out.println();
        do{
            System.out.print(spayce);
            b++;
            }while(b < space);
        do{
            System.out.print(dash);
            u++;
        }while(u < (num*2)-1);
        do{
            System.out.print(spayce);
            c++;
            }while(c < space);
        System.out.println();
        space--;
        num++;
        }while(num < response+1);
        end = false;
        }
        else{
            System.out.println("Enter a valid number next time.");
        }
    }
    
    else{
        System.out.println("Not an int.");
        return;
    }
    }
    }
}