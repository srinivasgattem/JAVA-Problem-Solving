public class Halfpyranum {
    public static void halfpyranum(int num){
        int  count=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
          System.out.print(count+" ");
          count++;}
      System.out.println();  }
    }
    public static void main(String[] args) {
        halfpyranum(5);
    
}
}