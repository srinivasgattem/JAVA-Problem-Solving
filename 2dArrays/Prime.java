public class Prime {
    public static Boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primerange(int n){
        for (int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        System.out.println(isprime(6));
        primerange(20);
    }
    
}
