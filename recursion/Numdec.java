// package recursion;

public class Numdec {
    public static void numdec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n+" ");
        numdec(n-1);
    }
    
    public static void main(String[] args) {
        numdec(5);
    }
}
