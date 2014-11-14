import java.util.Scanner;

public class lab11{
    public static void main(String[] args){
        int[] array = new int[10];
        int sum = 0;
        int input;
        int max = 0;
        int min = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 ints: ");
        for(int x = 0; x<10;x++){
            if(scan.hasNextInt()){
            input = scan.nextInt();
            array[x] = input;
            }
            else{
                System.out.println("Enter an int next time.");
                return;
            }
            if(sum==0&&array[x]!=0){
                max = array[x];
                min = array[x];
            }
            sum+=array[x];
            if(array[x]>max){
                max = array[x];
            }
            if(array[x]<min){
                min = array[x];
            }
        }
        System.out.println("The lowest entry is "+min);
        System.out.println("The highest entry is "+max);
        System.out.println("The sum is "+sum);
        int z = 9;
        for(int y = 0;y<10;y++){
            System.out.println(array[y]+" "+array[z]);
            z--;
        }
    }
}