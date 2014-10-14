//This program does a randomized roulette, using Math.random and nested while loops
//By Will Nagle
public class Roulette{
    public static void main(String[] args){
        int outerLoop=0, innerLoop=0;//the outer loop is the # of 100 tries, and the 100 times is the roulette tries per round
        double n = Math.random()*38;//picks a number
        int number = (int)n;//converts to int
        int wins = 0, loses=0;//counts wins and loses
        while(outerLoop<1000){//outer while loop
            while(innerLoop<100){//inner loop
                double r = Math.random()*38;//picks a number each roulette time
                int random = (int)r;//converts to int
                if (random==number){//compares with value
                    wins++;
                }
                else{
                    loses++;
                }
                innerLoop++;
            }
            outerLoop++;
            tries++;
            innerLoop = 0;
        }
        System.out.println("The number of wins was: "+wins+"\nThe number of loses was: "+loses);//Display results
        if (wins>2777){//Times required to go positive in net earnings
            wins = wins*36-100000;//sets wins to the money won.
            System.out.println("You made the money, you made: $"+wins);//victory screen, it VERY rarely appears, because gambling is bad
        }
        else{
            wins = 100000-wins*36;//sets wins equal to the money lost
            System.out.println("You didn't make the money, you lost $"+wins);//You should recieve this one, it lets you down softly though
        }
    }
}