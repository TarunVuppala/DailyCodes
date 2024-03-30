// https://hive.smartinterviews.in/contests/smart-interviews-primary/problems/smaller-elements
package Day34;
import java.util.*;

public class smallerElements {
    static long tc=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            tc=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            mergeSort(a,n,0,n-1);
            System.out.println(tc);
        }
        sc.close();
    }
    static void mergeSort(int a[],int n,int l,int h){
        if(l>=h){
            return;
        }
        int m=(l+h)/2;
        mergeSort(a,n,l,m);
        mergeSort(a,n,m+1,h);
        mergeCount(a,n,l,h);
    }

    static void mergeCount(int a[],int n,int l,int h){
        int temp[]=new int[h-l+1];
        int m=(l+h)/2;
        int i=l;
        int j=m+1;
        int k=0;
        int c=0;

        while(i<=m&&j<=h){
            if(a[i]<=a[j])
                temp[k++]=a[i++];
            else{
                temp[k++]=a[j++];
                c+=m-i+1;
            }
        }

        while(i<=m)
            temp[k++]=a[i++];

        while(j<=h)
            temp[k++]=a[j++];
        
        for(int x=l;x<=h;x++){
            a[x]=temp[x-l];
        }
        tc+=c;
    }
}