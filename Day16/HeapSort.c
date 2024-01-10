#include<stdio.h>
#include<stdlib.h>

void heapify(int a[],int n,int i){
	int l=i;
	int le=2*i+1;
	int r=2*i+2;
	if(le<n&&a[le]>a[l]){
		l=le;
	}
	if(r<n&&a[r]>a[l]){
		l=r;
	}
	if(l!=i){
		int t=a[i];
		a[i]=a[l];
		a[l]=t;
		heapify(a,n,i);
	}
}

void heapSort(int a[],int n){
	for(int i=n/2-1;i>=0;i--){
		heapify(a,n,i);
	}
	for(int i=n-1;i>=0;i--){
		int t=a[i];	
		a[i]=a[0];
		a[0]=t;
		heapify(a,n,i);
	}
}

void printarr(int a[],int n){
	for(int i=0;i<n;i++){
		printf("%d",a[i]);
	}
}
void main(){
	int n;
	scanf("%d",&n);
	int a[n];
	for(int i=0;i<n;i++){
		scanf("%d\n",&a[i]);
	}
	heapSort(a,n);
	printarr(a,n);
}