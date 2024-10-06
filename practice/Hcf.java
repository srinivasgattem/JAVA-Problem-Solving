import java.util.Scanner;

public class Hcf {
    public static int findhcf(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return findhcf(b, a%b);
        }
        
    }
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);

            System.out.println("enter your first number:");
            int num1=sc.nextInt();
            System.out.println("enter your second number:");
            int num2=sc.nextInt();
            int hcf=findhcf(num1, num2);

            System.out.println("hcf of "+num1+"and "+num2+"is: "+hcf);
           
    }
}
