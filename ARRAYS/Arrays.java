public class Arrays {
    public static int linearsearch(String numbers[],String key){
       for(int i=0;i<numbers.length;i++){
          if(numbers[i]==key){
             return i;
          }      
       }   return -1;         

    }
    public static void main(String[] args) {
        String numbers[]={"one","two","three"};
    String key="one";

      int index=linearsearch(numbers, key);
      if(index==-1){
        System.out.println("not found");
      }else{
        System.out.println("index of key is:"+index);
      }
    }
    
}
