import java.util.*;

public class UniqueElementsInArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<n;i++){
            k=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]&&i!=j){
                    k=1;
                    break;
                }
            }
            if(k==0){
                    System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}