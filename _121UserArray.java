import java.util.Scanner;
public class _121UserArray {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array");
     int size = sc.nextInt();
     int[] arr = new int[size];
     for(int i = 0; i < arr.length; i++){
        System.out.println("Enter a number");
        arr[i] = sc.nextInt();
     }
     for(int i = 0; i <arr.length; i++){
        System.out.println("Array at index " + i + " is " + arr[i]);

     }
  
    }

}
