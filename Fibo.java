import java.util.Scanner;

public class Fibo{
    public static int fibo(int x){
        if(x<=1)return x;
        return fibo(x-1)  + fibo(x-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter nth term:");
        int x=sc.nextInt();
        System.out.println(fibo(x));
    }
}