/*
    Output
    A
    A B A
    A B C B A
    A B C D C B A
    A B C D E D C B A
*/
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d",&n);
    int k;
    for(int i=0;i<n;i++){
        char c='A';
        for(int j=0;j<2*i+1;j++){
            if(j>i){
                k--;
            }
            else{
                k=j;
            }
            printf("%c ",c+k);
        }
        printf("\n");
    }
    return 0;
}