public class Pairsarrray {
    public static void pairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
         int curr=numbers[i];
         for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+curr+ "," +j +")");
         }System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        pairs(numbers);
    }
    
}
