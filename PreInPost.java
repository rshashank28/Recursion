import java.util.Scanner;

public class PreInPost {
    public static void pip(int n){
        if(n==0)return;
        System.out.println("pre"+n);//pre
        pip(n-1);
        System.out.println("in"+ n);//in
        pip(n-1);
        System.out.println("post"+ n);//post
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the n value:");
        int x=sc.nextInt();
        pip(x);
    }
    
}
