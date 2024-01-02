package Day10;

import java.util.*;
public class SuperReducedString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=superReducedString(s);
		System.out.println(s);
        sc.close();
	}
	public static String superReducedString(String s) {
    // Write your code here
        s=s.toLowerCase();
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                s=s.substring(0,i)+s.substring(i+2);
                if(i>0){
                    i--;
                }
            }
            else{
                i++;
            }
            
        }
        return s.equals("")?"Empty String":s;
    }
}
