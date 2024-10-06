import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
       int number=sc.nextInt();
       if(ispalindrome(number)){
        System.out.println("yes the num is palindrome");
       }
       else{
        System.out.println("its not palidrome");
       }}
       public static boolean ispalindrome(int num){
        int palindrome=num;
        int reverse=0;
        while(palindrome!=0){
            int rem=palindrome%10;
            reverse=reverse*10+rem;
            palindrome=palindrome/10;}
            if (num==reverse){
                return true;
            }
                return false;
        

    }
}
