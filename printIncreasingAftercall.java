import java.util.Scanner;

public class printIncreasingAftercall {
    public static void printt(int n){
        if(n==0)return ;//base case
        printt(n-1);//call
        System.out.println(n);//work
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your no:");
        int x=sc.nextInt();
        printt(x);
    }    
}
