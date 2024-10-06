// package recursion;

public class Firstocc {
    public static int fistocc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fistocc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,11,2,4,0,8,56,73};
        System.out.println(fistocc(arr, 8, 0));
    }
}
