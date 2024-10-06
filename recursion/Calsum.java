// package recursion;

public class Calsum {
    public static int calsum(int n){
        if(n==1){
            return 1;
        }
        int sum1=calsum(n-1);
        int sum=n+sum1;
        return sum;
    }
    public static void main(String[] args) {
       System.out.println(calsum(5)); 
    }
}
