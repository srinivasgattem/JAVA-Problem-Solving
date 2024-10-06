public class Patterns{
    public static void hallow_rectancle(int totcols,int totrows){
      for(int i=1;i<=totrows;i++){
        for(int j=1;j<=totcols;j++){
            if(i==1||i==totrows ||j==1||j==totcols){
             System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
    public static void inverted_halfpyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
    }
    }
    public static void floys_pyramid(int n){
        int count=1;
    for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(count+" ");
        count++;
    }
    System.out.println();
    }
    }
public static void main(String[]args){
 hallow_rectancle(5,4);
 inverted_halfpyramid(5);
 floys_pyramid(5);
}
}