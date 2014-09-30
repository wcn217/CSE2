import java.util.Scanner;
//By Will Nagle
//This program generates a boolean based question with 3 variables for the user to answer

public class BoolaBoola{
    public static void main(String[] args){
        boolean one = Math.random() < 0.5;//first generates a boolean at random
        boolean two = Math.random() < 0.5;//for each of the
        boolean three = Math.random() < 0.5;//three variables
        boolean opOne = Math.random() < 0.5;//generates true or false for a &&
        boolean opTwo = Math.random() < 0.5;//or a ||
        String uno = "";//String to store first operand
        String dos = "";//for second
        String answer = "";//stores t or f as the answer to the question
        String response = "";//checks user input as t or f and compares with answer
        boolean statement = true;//declares statement, but changes in program at random
        int a,b,c;//declared ints for converting booleans to ints for use in switch statements. Booleans cannot be used in switch statements
        Scanner myScanner = new Scanner(System.in);//declares scanner
        //-----------------//
        if (opOne)//sets the value a for the first operand and stores it for switch
        a = 1;
        else
        a = 0;
        if(opTwo)//sets value for b the same way as a
        b=1;
        else
        b=0;
        //-------------------//
        switch (a){
            case 1://a is true
                switch (b){
                    case 1: uno = "&&";dos = "&&";//b is also true
                    statement=one&&two&&three;
                    break;
                    case 0: uno = "&&";dos = "||";//b is false
                    statement=one&&two||three;
                    break;
                }
            break;
            case 0://a is false
                switch(b){
                    case 1: uno = "||";dos = "&&";//b is true
                    statement=one||two&&three;
                    break;
                    case 0: uno = "||";dos = "||";//b is also false
                    statement=one||two||three;
                    break;
                }
            break;
        }
        //------------------//
        if(statement)//generates c value based on the boolean statement generated in the a/b switch statements
        c=1;
        else
        c=0;
        switch(c){
            case 1: answer = "t";
            break;
            case 0:answer = "f";
            break;//stores as t for true and f for false
        }
        //------------------//
        System.out.println("Is the value of "+one+" "+uno+" "+two+" "+dos+" "+three+" true(T/t) or false(F/f)?");
        response = myScanner.next();//prints and promts user to respond
        switch (response){
            case "T": response = "t";//sets capital to negative to check once
            case "t": if(answer.equals(response)){
                System.out.println("Correct");//prints if correct answer
            }
            else{
                System.out.println("Wrong try again!");//prints otherwise
            }
            break;
            case "F": response = "f";//same for T and t
            case "f": if(answer.equals(response)){
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong try again!");
            }
            break;
            default: System.out.println("Wrong, not a valid answer!");//prints if its not T,t,F, or f
        }
                
        }
        
        
    }
