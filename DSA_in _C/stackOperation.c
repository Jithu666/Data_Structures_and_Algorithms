#include<stdio.h>
#include<stdlib.h>
void push(int*, int);
void pop(int*, int);
void display(int*, int);
int top = -1;
int main(){
    int *s, n, ch;
    printf("\n enter the size of the stack:");
    scanf("%d",&n);
    s=(int*)malloc(n*sizeof(int));
    while(1){
        printf("\n 1.push \n");
        printf("\n 2.pop \n");
        printf("\n 3.display \n");
        printf("\n 4.exit \n");
        printf("\n enter your choice \n");
        scanf("%d", &ch);
        switch(ch){
            case 1: push(s,n);
            break;
            case 2: pop(s,n);
            break;
            case 3: display(s,n);
            break;
            case 4: exit(0);
            break;
            default:
            printf("invalid choice entered");
        }
    }
    return -1;
}
void push(int *s, int n){
    if(top==(n-1)){
        printf("stack overflow");
        return;
    }
        printf("enter the value to the stack");
        scanf("%d", &s[++top]);
        return;
    }
    void pop(int *s, int n){
        if(top == -1){
            printf("stack is empty");
            return;
        }
            printf("\n element is deleted from the stack is %d",s[top--]);
            return;
        }
        void display(int s[], int n){
            int i;
            if(top == -1){
                printf("stack is empty");
                return;
                printf("the stack elements are : \n");
                for(i = top; i >= -1;i--){
                printf("the stack elements are, %d\n", s[i]);
                return;
            }
        }
    }