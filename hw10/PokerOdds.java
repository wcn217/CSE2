import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    //simulateOdds();
  }
  public static void showHands(){
        Scanner biden = new Scanner(System.in);
      int cardArray[] = new int[52];
      int startFill = 0;
      Random Reginold = new Random(); 
      for(int i = 2; i<15;i++){
          for(int fill = 0; fill<4; fill++){
              cardArray[startFill]=i;
              startFill++;
          }
      }
      int handArray[] = new int[5];
      int torandom = 0;
      for(int x = 0; x<handArray.length;x++){
          torandom = Reginold.nextInt(51);
          handArray[x]=cardArray[torandom];
      }
      int y = 0;
      String fun = "";
      int check = 0;
     for(int z = 0;z<handArray.length;z++){
         y=Reginold.nextInt(3);
         check = handArray[z];
         System.out.println(check);
         switch(check){
             case 2: fun="2";break;
             case 3: fun="3";break;
             case 4: fun="4";break;
             case 5: fun="5";break;
             case 6: fun="6";break;
             case 7: fun="7";break;
             case 8: fun="8";break;
             case 9: fun="9";break;
             case 10: fun="10";break;
             case 11: fun="Jack";break;
             case 12: fun="Queen";break;
             case 13: fun="King";break;
             case 14: fun="Ace";break;
         }
         if(y==0){System.out.println("The "+fun+" of hearts.");}
         if(y==1){System.out.println("The "+fun+" of clubs.");}
         if(y==2){System.out.println("The "+fun+" of diamonds.");}
         if(y==3){System.out.println("The "+fun+" of spades.");}
         
     }
     System.out.println("Another go? Y/y for yes, anything else for no.");
        String response = biden.next();
     if(response.equals("Y")||response.equals("y")){showHands();}
  }
}
