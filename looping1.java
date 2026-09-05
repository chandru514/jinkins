import java.util.Scanner;
public class looping1 {
    public static void main(String[]args){
         try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n>0){
                System.out.println("Enter the n value:"+n);
                n--;
            }
             do{
                System.out.println(n);
                n++;
             }while(n<10);
        
             for(int i=n;i>=0;i--){
                System.out.println("Enter the n value1:"+n);
                n--;
             }
        }
    }
    
}
