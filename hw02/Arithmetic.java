public class Arithmetic{
    public static void main (String[] args){
        int nSocks=3;
        double sockCost$=2.58;
        int nGlasses=6;
        double glassCost$=2.29;
        int nEnvelope=1;
        double envelopeCost$=3.25;
        double taxPercent =0.06;
        double totalSockCost$;
        double totalglassCost$;
        double totalenvelopeCost$;
        
        totalSockCost$=(nSocks*sockCost$)*(1+taxPercent);
        totalglassCost$=(nGlasses*glassCost$)*(1+taxPercent);
        totalenvelopeCost$=(nEnvelope*envelopeCost$)*(1+taxPercent);
        
        double costOne = Math.round(totalSockCost$*100.0)/100.0;
        double costTwo = Math.round(totalglassCost$*100.0)/100.0;
        double costThree = Math.round(totalenvelopeCost$*100.0)/100.0;
        
        System.out.println("The cost of "+nSocks+" socks is $"+costOne);
        System.out.println("The cost of "+nGlasses+" glasses is $"+costTwo);
        System.out.println("The cost of "+nEnvelope+" envelopes is $"+costThree);
    }
}