import java.util.Scanner;

public class sum {
    public static void sum(int x,int s){
       if(x==0){
        System.out.println(s);
        return;
       }
       sum(x-1,s+x);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your no:");
        int x=sc.nextInt();
        sum(x,0);
    }
    
}
