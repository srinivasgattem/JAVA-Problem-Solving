
public class Fstexpo {
    public static int fstexpo(int a,int n){
        int ans=1;
        while(n>0){
            if ((n & 1)!=0) {
                ans=ans * a;
            }
            a=a*a;
          n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fstexpo(5, 3));
        System.out.println(2^8);
    }
}
