import java.util.*;
public class Largestnum {
    public static int largestnum(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
           if(largest < numbers[i]){
            largest=numbers[i];
           }
             }  return largest;
    }
    public static void main(String[] args) {
        int numbers[]={3,4,7,9,5};
     System.out.println("largest num is:"+largestnum(numbers));  }
}
