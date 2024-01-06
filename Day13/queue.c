#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
};

struct node *front=NULL, *rear=NULL;

void enqueue(int d){
    struct node *newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=d;
    newnode->next=NULL;
    if(rear==NULL){
        front=rear=newnode;
        return;
    }
    rear->next=newnode;
    rear=newnode;
}

void dequeue(){
    if(front==NULL){
        printf("Queue is empty.\n");
        return;
    }
    struct node *temp=front;
    front=front->next;
    free(temp);
    
    if(front==NULL){
        rear=NULL;
    }
}

void traversal(){
    if(front==NULL){
        printf("Queue is empty.\n");
        return;
    }
    struct node *temp=front;
    while(temp!=NULL){
        printf("%d\t",temp->data);
        temp=temp->next;
    }
    printf("\n");
}

int main() {
    int ch, value;

    while(1) {
        printf("1. Enqueue\n2. Dequeue\n3. Traversal\n4. Exit\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("Enter a value:");
                scanf("%d", &value);
                enqueue(value);
                traversal();
                break;
            case 2:
                dequeue();
                traversal();
                break;

            case 3:
                traversal();
                break;
            case 4:
                exit(0);
            default:
                printf("Enter a valid option.\n");
        }
    }
}
