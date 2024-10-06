public class Binearysearch {
    public static int binearysearch(int numbers[],int key){
            int start=0;int end=numbers.length-1;
          while(start<=end){
              int mid=(start+end)/2;
                if(numbers[mid]==key){
                    return mid;
                }
                if(numbers[mid]<key){
               start=mid+1;
                }else{
                   end=mid-1;
                }
            }return -1;
    }
    public static void main(String[] args) {
        int numbers[]={11,12,13,14,15,16,17,18,19,20};
        int key= 19;
     System.out.println("index of key is:"+binearysearch(numbers, key));
        
    }
    
}
