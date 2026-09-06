import java.util.*;
public class wompus {
     static char[][] World={
          {'A', '\0', '\0', 'P'},
          {'\0', 'W', '\0', '\0'},
          {'\0', '\0', 'P', '\0'},
          {'\0', '\0', '\0', 'G'}
      };
     static int x=0;
     static int y=0;
     static boolean percept(int x,int y){
        System.out.println("\n current position:("+(x+1)+","+(y+1)+")");
        if(World[x][y]=='W'){
            System.out.println("you are enter in the wompus!game over");
            return false;
        }
        if(World[x][y]=='P'){
            System.out.println("you are enter in the pit!game over");
            return false;
        }
        if(World[x][y]=='G'){
            System.out.println("you are enter in the gold!you win");
            return false;
        }
        if(x>0 && World[x-1][y]=='W'){
            System.out.println("stench detected");
        }
        if(x<3 && World[x+1][y]=='W'){
            System.out.println("stench detected");
        }
        if(y>0 && World[x][y-1]=='W'){
            System.out.println("stench detected");
        }
        if(y<3 && World[x][y+1]=='W'){
            System.out.println("Stench detected");
        }
        return true;

     }

    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            boolean game=true;
            while(game){
                System.out.println("Enter the direction u want to move:(w=up,s=down,a=left,d=right)");
                char direction=sc.next().charAt(0);
                switch(direction){
                    case 'U':
                        if(x>0){
                            x--;
                        }
                        break;
                    case 'D':
                        if(x<3){
                            x++;
                        }
                        break;
                    case 'L':
                        if(y>0){
                            y--;
                        }
                        break;
                    case 'R':
                        if(y<3){
                            y++;
                        }
                        break;
                    default:
                        System.out.println("Invalid direction");
                }
                game=percept(x,y);
            }
        }
    }
}
