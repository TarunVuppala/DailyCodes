package Day20;

import java.util.*;

public class TheatreSquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double m=sc.nextDouble();
        double n=sc.nextDouble();
        double a=sc.nextDouble();
        long c=(long)Math.ceil(m/a)*(long)Math.ceil(n/a);
        System.out.println(c);
        sc.close();
    }
}