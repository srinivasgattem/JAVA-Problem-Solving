import java.util.*;
public class Reversearray {
    public static void reverse(int numbers[]){
        int first=0;int last=numbers.length-1;
        while(first<last){
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
     first++;
    last--;   }
    }
    public static void main(String[] args) {
        int numbers[]={11,12,13,14,15,16,17,18,19};
     reverse(numbers);
      for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
      }System.out.println();
    } 
    
}
