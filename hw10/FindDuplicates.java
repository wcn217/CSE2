import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  /* My Code*/
  public static boolean hasDups(int[] potato){
      for(int i=0; i<potato.length;i++){
          for(int j=0; j<potato.length; j++){
              if(potato[i]==potato[j]&&i!=j){return true;}//Scans through the array if the array at location i is equal to location j and as long as i and j are no the same location
                                                          //then there is a duplicate!
          }
      }
      return false;
  }
  public static boolean exactlyOneDup(int[] icecream){
      boolean one = false;
      int theOne = icecream[0];
      for(int k=0; k<icecream.length;k++){
          for(int x=0; x<icecream.length;x++){
              if(one==true&&icecream[k]==icecream[x]&&icecream[k]!=theOne&&k!=x){return false;}//If one already is true and it finds a new duplicate that isn't the same as the already found duplicate,
                                                                                              //then there are now 2 duplicates, and it returns false.
              if(one==false&&icecream[k]==icecream[x]&&k!=x){one = true; theOne=icecream[k];}//Changes one to true if one hasnt been set before and when array at location k is same as location x
                                                                                            //but once again, not if k = x. 
          }
      }
      return one;
  }
}   