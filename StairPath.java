import java.util.Scanner;

public class StairPath {

    
    public static int Stair(int x){
        if(x <= 3 && x!=2)return x;
        return Stair(x-1)  + Stair(x-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter nth term:");
        int x=sc.nextInt();
        System.out.println(Stair(x));
    }
    
}
