import java.util.*;
public class arrays {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int arr[]= new int[5];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                System.out.println("Enter the array value:"+arr[i]);
            }
             int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
                   System.out.println("Total of array value:"+total);
        }
    }

    
}
