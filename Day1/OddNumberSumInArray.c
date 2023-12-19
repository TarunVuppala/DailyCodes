#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d",&n);
    int so=0,k;
    for(int i=0;i<n;i++){
        scanf("%d",&k);
        if(k%2!=0)
            so+=k;
    }
    printf("%d",so);
    return 0;
}