#include<stdio.h>
#include<stdlib.h>

struct node{
    int num;
    struct node * left;
    struct node * right;
};
typedef struct node *NODE;

NODE getnode();
NODE create(NODE root);
void inorder(NODE root);
void preorder(NODE root);
void postorder(NODE root);

int main(){
    NODE root = NULL;
    int ch;
    while(1){
        printf("1. Create tree\n");
        printf("2. inorder traversal\n");
        printf("3. preorder traversal\n");
        printf("4. postorder traversal\n");
        printf("5. exit\n");
        printf("** enter your choice\n");
        scanf("%d",&ch);
    switch(ch){
        case 1: root = create(root);
        break;
        case 2: printf("Inorder traversal");
        inorder(root);
        break;
        case 3: printf("preorder traversal");
        preorder(root);
        break;
        case 4: printf("postorder traversal");
        postorder(root);
        break;
        case 5: exit(0);
        break;
        default : printf("invalid choie");
        }
    }
}


NODE getnode(){
    return (struct node *)malloc(sizeof(struct node*));
}

NODE create(NODE root){
    NODE cur, prev, newnode;
    newnode = getnode();
    printf("enter the element");
    scanf("%d",&newnode->num);
    newnode -> left = newnode -> right = NULL;
    if(root == NULL)
        return(newnode);
    cur = root;
    prev = NULL;
    while(cur!=NULL){
        prev = cur;
        if(newnode -> num < cur -> num)
            cur = cur -> left;
        else
            cur = cur -> right;
    }
    if(newnode -> num < prev -> num)
        prev -> left = newnode;
    else
        prev -> right = newnode;
return (root);
   }

void inorder(NODE root){
    if(root != NULL){
        inorder(root->left);
        printf("%d",root->num);
        inorder(root->right);
    }
}

void preorder(NODE root){
    if(root != NULL){
        printf("%d",root->num);
        preorder(root->left);
        preorder(root->right);
    }
}

void postorder(NODE root){
    if(root != NULL){
        postorder(root->left);
        postorder(root->right);
        printf("%d",root->num);
    }
}