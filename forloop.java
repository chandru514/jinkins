import java.util.Scanner;
public class forloop {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int i=a;i<=b;i=i+1){
                System.out.println("Enter the value of a:"+i);
            }
        }
    }
    
}
