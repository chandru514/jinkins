public class condition {
    public static void main(String[]args){
        int a=10;
        int b=20;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a<b){
            System.out.println("a is less than b");
        }
        else if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("Invalid");
        }

        int n   = 3;
        switch(n){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;  
            case 4:
                System.out.println("wednesday");
                break;  
            case 5:
                System.out.println("thursday");     
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                    break;
                    default:
                        System.out.println("invalid");
        }
    }
}

        
