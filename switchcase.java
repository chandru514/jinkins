import java.util.*;
public class switchcase {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            String name=sc.next();
            System.out.println("Enter the worker name:"+name);
        switch(name){
            case "chandru":
                System.out.println(name + " work as monday");
                break;
            case "jagan":
                System.out.println(name + " work as tuesday");
                break;
            case "santhosh":
                System.out.println(name + " work as webnesday");
                break;
            case "jagadish":
                System.out.println(name + " he work as thursday");
                break;
            default:
                System.out.println(name +" is not in the company ." );

        }
        
    }
    
}
}