public class Halfpyra {
    public static void halfpyranum(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
          System.out.print(j);
            }
      System.out.println();  }
    }
    public static void main(String[] args) {
        halfpyranum(5);
    }
}
