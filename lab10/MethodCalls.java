public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit(int one,int toAdd){
    boolean check = true;
    if(one<0){
        one=one*-1;
        check=false;
    }
    int newvar = one;
    if(toAdd>9||toAdd<0){return one;}
    else{
        do{
            newvar = newvar/10;
            toAdd = toAdd*10;
        }while(newvar>0);
    }
    if(check){
    return (one+toAdd);}
    else{return -(one+toAdd);}
    }
    public static int join(int one, int two){
        return addDigit(two,one);
    }
}  
