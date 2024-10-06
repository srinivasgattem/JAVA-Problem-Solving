public class Subarrays {
    public static void subarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                // System.out.println(currsum);
                for(int k=start;k<=end;k++){
                    // System.out.print(numbers[k]+" ");
                    currsum += numbers[k];
              }
              System.out.print(currsum);
              if(maxsum<currsum){
                maxsum=currsum;
                }System.out.println();
            }System.out.println();

        }  System.out.print("max sum ="+ maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
    }
    
}
