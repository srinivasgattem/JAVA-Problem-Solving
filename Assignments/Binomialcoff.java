public class Binomialcoff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoff(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);
       int bincoff=n_fact/(r_fact*n_r_fact);
return bincoff;
    }
    public static void main(String[] args) {
        System.out.println(bincoff(5, 02));
    }
}
