import java.util.Scanner;
//recurrence relation or formula based type;
public class sumReturnType {
    public static int sum(int n){
        if(n==1||n==0){
            return 1;
        }
        return n+sum(n-1);  //sum = n+sum(n-1);
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.print("enter your no:");
        int x=sc.nextInt();
       System.out.println(sum(x));
    }
    
}
