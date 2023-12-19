#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    long int a[n];
    for(int i=0;i<n;i++){
        scanf("%ld",&a[i]);
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                printf("%ld",a[i]);
                break;
            }
        }
    }


    return 0;
}