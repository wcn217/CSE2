import java.util.Scanner;
import java.lang.Math;
//By Will Nagle
//This program allows the user to play Craps, draw a card from the deck, or play roulette.
public class RandomGames{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare scanner
        String response;//intiailize variable to store for switch
        System.out.print("Press R/r for roulette, C/c for craps, or P/p for Pick a card!-");//promt text
        response = myScanner.next();//input
        
        if (response.length()>1){//checks for a non single char
            System.out.println(response+" is not a valid game because it has more than one character!");
        }
        else{
        //----------------------------------------------------//
        //--------------------GAMES--------------------------//
        //----------------------------------------------------//
        switch(response){
            case "r"://roulette
            case "R":{//both capital and lowercase check for each
            double preResult = 0;//math.random pre created variable
            preResult = Math.random()*39+-2;//****E at Bottom of Program******
            int result = (int)preResult;//var type change
            String rouletteFinal = "";//string to print declared
            if (result == -1){//**A**
                rouletteFinal = "00";//modify string
            }
            else{
                rouletteFinal+=result;//modify string to correct printed value
            }
            System.out.println("Roulette: "+rouletteFinal);//print results
            }
            break;
           
            case "c":
            case "C":{//craps
            double crapsDiOne = Math.random()*6+1;//both di
            double crapsDiTwo = Math.random()*6+1;//generate at random
            int one = (int)crapsDiOne;//turn both
            int two = (int)crapsDiTwo;//to ints
            int total = one+two;//add them
            System.out.println(one+" + "+two+" = "+total);//print desired results
            }
            break;
            case "p":
            case "P"://pick a card
            System.out.println("This game has not yet been implemented!");
            break;
            
            default:
            System.out.println("This is not a valid character (R,r,P,p,C,c)");//check if the single char isnt a valid one
            break;
            
        }
        }
        
    }
}

//**E** - You must use 39 and -2 as the math. random range to get all the roulette possibilities
//by using 39 and -2, the -2 is taken away from the 39 giving you 37 possibilities, but because
//the range is (-2,36] and the ( meaning non inclusive, the number possiblitiies are -1 through 36
//-1 must be included to have a value to represent 00 **A**