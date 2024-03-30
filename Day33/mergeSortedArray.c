// https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
#include<stdio.h>
#include<stdlib.h>

int* merge(int* A, int n1, int* B, int n2) {
    int p1=0,p2=0;
    int *c=malloc((n1+n2)*sizeof(int));
    int k=0;
    while(p1<n1 && p2<n2){
        if(A[p1]<B[p2])
            c[k++]=A[p1++];
        else
            c[k++]=B[p2++];
    }
    while(p1<n1)
        c[k++]=A[p1++];
    while(p2<n2)
        c[k++]=B[p2++];
    return c;
}

int main() {
    int n1,n2;;
    scanf("%d",&n1);
    int A[n1];
    for(int i=0;i<n1;i++)
        scanf("%d",&A[i]);
    scanf("%d",&n2);
    int B[n2];
    for(int i=0;i<n2;i++)
        scanf("%d",&B[i]);
    int *c=merge(A,n1,B,n2);
    for(int i=0;i<n1+n2;i++)
        printf("%d ",c[i]);
    return 0;
}