// package recursion;

public class Lastocc {
    public static int lastocc(int arr[],int key,int i){
        if(i==arr.length){
            return-1;
        }
        int issfound=lastocc(arr, key, i+1);
        if(arr[i]==key && issfound== -1){
            return i;
        }
        return issfound;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,11,2,5,0,7,56,73};
        System.out.println(lastocc(arr, 5, 0));
    }
}
