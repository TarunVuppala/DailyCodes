#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* next;
};

struct node* top = NULL;

void push(int d) {
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = d;
    newnode->next = top;
    top = newnode;
}

void pop() {
    if (top == NULL) {
        printf("Stack is empty.\n");
        return;
    }
    struct node *temp = top;
    top = top->next;
    free(temp);
}

void peek() {
    if (top == NULL) {
        printf("Stack is empty.\n");
        return;
    }
    printf("Top element: %d\n", top->data);
}

void display() {
    if (top == NULL) {
        printf("Stack is empty.\n");
        return;
    }
    struct node* temp = top;
    printf("Stack elements\n");
    while (temp != NULL) {
        printf("%d\n", temp->data);
        temp = temp->next;
    }
}

void main() {
    int ch, value;
    while (1) {
        printf("1. Push\n2. Pop\n3. Peek\n4. Display\n5. Exit\nEnter your choice:");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("Enter a value:");
                scanf("%d", &value);
                push(value);
                display();
                break;
            case 2:
                pop();
                display();
                break;
            case 3:
                peek();
                break;
            case 4:
                display();
                break;
            case 5:
                exit(0);
            default:
                printf("Enter valid choice\n");
        }
    }
}
