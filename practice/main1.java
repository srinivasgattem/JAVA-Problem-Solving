import java.util.Arrays;
public class main1 {
    static int arr1[]=new int[]{1,12,9,3,17,20};
    static int arr2[]=new int[]{2,3,8,13};
    static void merge(int m,int n){
    for(int i=n-1;i>=0;i--){
        int j,last=arr1[m-1];
for(j=m-2;j>=0 && arr1[j]>arr2[i];j--)arr1[j+1]=arr1[j];
if (j!=m-2||last>arr2[i]){
    arr1[j+1]=arr2[i];arr2[i]=last;
} }}
public static void main(String[]args){
    merge(arr1.length,arr2.length);
    System.out.print("after merging first array");
    System.out.println(Arrays.toString(arr1));
    System.out.print("second array");
    System.out.println(Arrays.toString(arr2));
}
    
}
