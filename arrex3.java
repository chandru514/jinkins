import java.util.Scanner;
 public class arrex3 {


    static int  search(int arr[], int searchelement){
        boolean found = false;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==searchelement){
                found =true;
                break;
            }
        }
        if (found)
             return i;
        else 
            return -1;


    }
    
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            int arr[]={10,20,30,40,50};
            int serchelement=sc.nextInt();  
            int result = search(arr, serchelement);
            System.out.println("Index of " + serchelement + " is: " + result);


        }
    }

    
}
