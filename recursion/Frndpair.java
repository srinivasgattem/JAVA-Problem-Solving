// package recursion;

public class Frndpair {
    public static int frndpair(int n){
        if(n==1||n==2){
            return n;
        }
        return frndpair(n-1)+(n-1)*frndpair(n-2);
    }
    public static void main(String[] args) {
        System.out.println(frndpair(3));
    }
}
