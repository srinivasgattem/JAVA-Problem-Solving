// package recursion;

public class Dupliocc {
    public static void dupliocc(String str,int idx,StringBuilder newstr,boolean arr[]){
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if (arr[currchar-'a']==true) {
             dupliocc(str, idx+1, newstr, arr);
        }
         else{
            arr[currchar-'a']=true;
            dupliocc(str, idx+1, newstr.append(currchar), arr);
         } 
    }
    public static void main(String[] args) {
        String str="apppnnacollegge";
        dupliocc(str, 0,  new StringBuilder (""), new boolean[26]);
    }
}
