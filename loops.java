import java.util.*;
public class loops {
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%5==0){
                    System.out.println("Multiple of 3 and 5:"+i);
                }
            }
        }
    }
    }
    

