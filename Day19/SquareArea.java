package Day19;
import java.util.*;

public class SquareArea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int x3=sc.nextInt();
            int y3=sc.nextInt();
            int x4=sc.nextInt();
            int y4=sc.nextInt();
            int side=0;
            if(x1==x2){
                side=(int) Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
            }
            if(x1==x3){
                side=(int) Math.sqrt((y3-y1)*(y3-y1)+(x3-x1)*(x3-x1));
            }
            if(x1==x4){
                side=(int) Math.sqrt((y4-y1)*(y4-y1)+(x4-x1)*(x4-x1));
            }
            System.out.println(side*side);
        }
        sc.close();
    }
}