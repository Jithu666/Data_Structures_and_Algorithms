#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    struct node *llink;
    struct node *rlink;
    };
typedef struct node *NODE;

NODE getnode(){
    return ((struct node*)malloc(sizeof(struct node*)));
}
NODE insert(int item, NODE head){
    NODE temp, cur;
    temp = getnode();
    temp -> info = item;
    cur = head -> rlink;
    head -> rlink = temp;
    temp -> llink = head;
    temp -> rlink = cur;
    cur -> llink = temp;
    return head;
}

NODE insert_rear(int item, NODE head){
    NODE temp, cur;
    temp = getnode();
    temp -> info = item;
    cur = head -> llink;
    head -> llink = temp;
    temp -> rlink = head;
    temp -> llink = cur;
    cur -> rlink = temp;
    return head; 
}

NODE delete(NODE head){
    NODE cur, next;
    if(head -> rlink = head)
    {
        printf("list  is empty");
        return head;
    }
    cur = head -> rlink;
    next = cur -> rlink;
    head -> rlink = next;
    next -> llink = head;
    printf("deleted element is :%d", cur -> info);
    free (cur);
    return head;
}

NODE delete_rear(NODE head){
    NODE cur, prev;
    if(head -> rlink == head)
    {
        printf("List is empty");
        return head;
    }
    cur = head -> llink;
    prev = cur -> llink;
    head -> llink = prev;
    prev -> rlink = head;
    printf("deleted item : %d", cur->info);
    free(cur);
    return head;
}

void display(NODE head){
    NODE temp;
    if(head->rlink==temp)
    {
        printf("List is empty");
        return;
    }
    printf("contents of the linked list are :");
    temp=head->rlink;
    while(temp != head){
        printf("%d<--->", temp->info);
        temp = temp -> rlink;
    }
}

int main(){
    int item, ch;
    NODE head;
    head = getnode();
    head -> llink = head;
    head -> rlink = head;
        while(1){
            printf("**DOUBLY LINKED LIST OPERATIONS**\n");
            printf("1. INSERT_BEGINING\n");
            printf("2. INSERT_REAR\n");
            printf("3. DELETE_BEGINING\n");
            printf("4. DELETE_REAR\n");
            printf("5. DISPLAY\n");
            printf("6. EXIT\n");
            printf(" ** enter your choice\n");
            scanf("%d", &ch);
        switch(ch){
            case 1: printf("enter item");
                    scanf("%d", &item);
                    head = insert(item,head);
                    break;
            case 2: printf("enter item");
                    scanf("%d", &item);
                    head = insert_rear(item, head);
                    break;
            case 3: head = delete(head);
                    break;
            case 4: head = delete_rear(head);
                    break;       
            case 5: display(head);
                    break;
            case 6:exit(0);
            default: printf("invalid choice entered");
        }
    }
    return 0;
}