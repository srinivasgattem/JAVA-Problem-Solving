// package Dividenconquer;

public class Sortrot {
public static int search(int arr[],int tar,int si,int ei){
if(si>ei){
    return -1;
}
int mid =si+(ei-si)/2;
if(arr[mid]==tar){
    return mid;
}
if(arr[si]<=arr[mid]){
    if (arr[si]<=tar && tar<=arr[mid]){
    return search(arr, tar, si, mid-1);
}
else{
    return search(arr, tar, mid+1, ei);
}}
else{
    if(arr[mid]<=tar && tar<=arr[ei]){
    return search(arr,tar,mid+1,ei);
}
else{
    return search(arr, tar, si, mid-1);
}
}

}
public static void main(String[] args) {
    int arr[]={2,6,1,8,9,11,3,5,2,10};
    int target=5;
int taridx=search(arr,target,0,arr.length-1);  
System.out.println(taridx);
}}
