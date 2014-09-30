import java.util.Scanner;
//Program by Will Nagle
//This program uses switch statements to build an order at Burger King
//home of the Whopper
public class BurgerKing{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String order, type;
        System.out.print("Enter a letter to indicate the choice of:\nBurger (B or b)\nSody Pop (S or s)\nPapas Fritas (F or f)");
        order = input.next();//Promts the user and asks what choice they would like
        if(order.length()>1){//Sets a preloaded response if its more than 1 letter
                order = "AA";
            }
        switch(order){
                case "B":
                case "b": System.out.print("Enter A/a for all condiments\nC/c for cheese\nN/n for nothin'!");//Case if its a burger
                type = input.next();
                switch(type){
                    case "A":
                    case "a": System.out.println("Your order was a burger with everything on it!");//All condiment response
                    return;
                    case "C":
                    case "c": System.out.println("Your order was a cheeseburger.");//With just cheese
                    return;
                    case "N":
                    case "n": System.out.println("Your order was a plain burger.");//No condiments
                    return;
                    default: System.out.println("That is not a condiment choice!");//if anything else, its not a valid condiment
                    return;
                }
                case "S":
                case "s": System.out.print("Enter P/p for Pepsi, C/c for Coke, S/s for Sprite, or M/m for Moutain Dew");//asks for Soda type
                type = input.next();
                switch(type){
                    case "P":
                    case "p": System.out.println("Your order was a Pepsi");
                    return;
                    case "C":
                    case "c": System.out.println("Your order was a Coke");
                    return;
                    case "S":
                    case "s": System.out.println("Your order was a Sprite");
                    return;
                    case "M":
                    case "m": System.out.println("Your order was a Mountain Dew");
                    return;
                    default: System.out.println("That is not a soda choice!");//check if it is not valid
                    return;
                }
                case "F":
                case "f": System.out.print("Enter L/l for Large fries or S/s for small fries.");//asks which type of fries
                type = input.next();
                switch(type){
                    case "L":
                    case "l": System.out.println("Your order was a large fries");
                    return;
                    case "S":
                    case "s": System.out.println("Your order was a small fries");
                    return;
                    default: System.out.println("That is not a size choice!");//check for a invalid response
                    return;
                }
                case "AA": System.out.println("You cannot enter more than one character at a time...");//uses the check if its more than one letter to display error
                break;
                default: System.out.println("Invalid response!");//If it is one letter and not a valid option
                break;
        
        
            }
}
}