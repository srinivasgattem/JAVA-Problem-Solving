// package recursion;

public class Factorial {
    public static int fact(int n){
        if (n==0){
            // System.out.println(1);
        return 1;
        }
        int fact1=fact(n-1);
        int fact=n*fact1;
        return fact;
    }
    public static void main(String[] args) {
     System.out.println(fact(5)                             );   
    }
}
