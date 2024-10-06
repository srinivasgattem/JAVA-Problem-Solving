public class friendlypair {
static int sumofdivisors(int number){
    int sum=0;
    for(int i=1;i<=number/2;i++){
        if(number%i==0){
            sum+=i;}
        }return sum;
    }
    static boolean isfriendlypair(int num1,int num2){
        return sumofdivisors(num1)==num2&& sumofdivisors(num2)==num1;
    }
    public static void main(String args[]){
        int numb1=220;
        int numb2=284;
        if(isfriendlypair(numb1,numb2)){
            System.out.println(numb1+"and"+numb2+" are a friendly pair");
        }
        else{
            System.out.println(numb1+"and"+numb2+"are not friendly pair");
        }
}    
}
