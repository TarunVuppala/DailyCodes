//BinarySearchTree

#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* left;
    struct node* right;
};
struct node* root = NULL;

struct node* findMin(struct node* root) {
    while (root != NULL && root->left != NULL)
        root = root->left;

    return root;
}

struct node* findMax(struct node* root) {
    while (root != NULL && root->right != NULL)
        root = root->right;

    return root;
}

struct node* insert(struct node* root, int value) {
    if (root == NULL) {
        struct node* newnode = (struct node*)malloc(sizeof(struct node));
        newnode->data = value;
        newnode->left = newnode->right = NULL;
        return newnode;
    }

    if (value < root->data)
        root->left = insert(root->left, value);
    else if (value > root->data)
        root->right = insert(root->right, value);

    return root;
}


struct node* delete(struct node* root, int value) {
    if (root == NULL)
        return root;

    if (value < root->data)
        root->left = delete(root->left, value);
    else if (value > root->data)
        root->right = delete(root->right, value);
    else {
        if (root->left == NULL) {
            struct node* temp = root->right;
            free(root);
            return temp;
        } else if (root->right == NULL) {
            struct node* temp = root->left;
            free(root);
            return temp;
        }
        struct node* temp = findMin(root->right);
        root->data = temp->data;
        root->right = delete(root->right, temp->data);
    }

    return root;
}

struct node* search(struct node* root, int value) {
    if (root == NULL || root->data == value)
        return root;

    if (value < root->data)
        return search(root->left, value);
    else
        return search(root->right, value);
}

void inorder(struct node* root) {
    if (root != NULL) {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}

void postorder(struct node* root) {
    if (root != NULL) {
        postorder(root->left);
        postorder(root->right);
        printf("%d ", root->data);
    }
}

void preorder(struct node* root) {
    if (root != NULL) {
        printf("%d ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

int main() {
    int ch, value;

    while (1) {
        printf("1. Insert\n2. Delete\n3. Find Min\n4. Find Max\n5. Search\n6. Inorder Traversal\n7. Postorder Traversal\n8. Preorder Traversal\n9. Exit\nEnter your choice: ");
        scanf("%d", &ch);

        switch (ch) {
            case 1:
                printf("Enter value: ");
                scanf("%d", &value);
                root = insert(root, value);
                break;
            case 2:
                printf("Enter value: ");
                scanf("%d", &value);
                root = delete(root, value);
                break;
            case 3:
                printf("Minimum value: %d\n", findMin(root)->data);
                break;
            case 4:
                printf("Maximum value: %d\n", findMax(root)->data);
                break;
            case 5:
                printf("Enter value: ");
                scanf("%d", &value);
                if (search(root, value) != NULL)
                    printf("Value found.\n");
                else
                    printf("Value not found.\n");
                break;
            case 6:
                printf("Inorder traversal: ");
                inorder(root);
                printf("\n");
                break;
            case 7:
                printf("Postorder traversal: ");
                postorder(root);
                printf("\n");
                break;
            case 8:
                printf("Preorder traversal: ");
                preorder(root);
                printf("\n");
                break;
            case 9:
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}
