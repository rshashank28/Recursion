import java.util.Scanner;


public class factoriall {

    public static int fact(int n){
   if(n==1||n==0)return 1;  //base case
        
      int y= n *fact(n-1); //call
      return y;
    
  }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your no:");
        int x=sc.nextInt();
       System.out.println(fact(x));
    }
    
}
