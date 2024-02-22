import java.util.Scanner;

public class printDecrease {
    public static void printt(int x){
       if(x==0)return;
        System.out.print(x+" ");
        printt(x-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no:");
        int x=sc.nextInt();
        printt(x);
    }
}
