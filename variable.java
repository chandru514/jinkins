import java.util.Scanner;
public class variable {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            System.out.println("Integer: " + a);
            System.out.println("String: " + b);
        }
    }

    
}
