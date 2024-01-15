#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *head=NULL;

struct node* insertNodeAtHead(struct node* llist, int data) {
    struct node* newnode=(struct node*) malloc(sizeof(struct node));
    newnode->data=data;
    newnode->next=llist;
    llist=newnode;
    return llist;
}
void main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int data;
        scanf("%d",&data);
        head=insertNodeAtHead(head,data);

    }
    struct node*temp=head;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }
    free(temp);
    
}