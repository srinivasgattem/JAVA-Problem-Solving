import java.util.*;
public class primefac {
    static void printprimefactors(int number){
        while(number%2==0){
            System.out.println(number+" ");
            number/=2;
        }
        for(int i=3;i<=Math.sqrt(number);i+=2){
            while(number%i==0){
           System.out.println(number+" ");
           number/=i;}
        }
    if(number>2){
        System.out.println(number+" ");}
    }
public static void main(String args[]){
  int number=315;
  System.out.println("prime factors of"+number+"are:");
  printprimefactors(number);
}
}
