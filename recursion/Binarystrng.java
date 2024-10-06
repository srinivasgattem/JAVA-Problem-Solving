// package recursion;

public class Binarystrng {
    public static void printbinstng(int n,int lastplace,String str){
        if(n==0){
          System.out.println(str);
          return;
        }
    printbinstng(n-1, 0, str+"0");
    if(lastplace==0){
    printbinstng(n-1, 1, str+"1");
     } }
     public static void main(String[] args) {
printbinstng(3, 0, "");
     }
}
