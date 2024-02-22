package Recursion;
public class arrayTraversal {
    public static void print(int i,int[] arr){
        if(i==arr.length)return;
        System.out.println(arr[i]+" ");
        print(i+1, arr) ;
    }
    public static void main(String[] args) {
    int[] arr={4,9,6,8,7,3,5,49,62,54,78,41};
     print(0,arr);    
    }
    
}
