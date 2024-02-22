import java.util.Scanner;

public class printIncrease {
    public static void printt(int b ,int x){
        System.out.print(b+" ");    //if(b>x) without any extra parameter
        if(b==x)return;
        printt(b+1,x);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("emter start no:");
        int a=sc.nextInt();
        System.out.print("enter your no:");
        int x=sc.nextInt();
        printt(a,x);
    }
    
}
