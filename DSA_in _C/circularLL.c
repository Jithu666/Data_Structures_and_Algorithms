#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    struct node *link;
};
typedef struct node * NODE;

NODE getnode(){
    return ((struct node*)malloc(sizeof(struct node)));
}

NODE insert_rear(int item, NODE last){
    NODE temp;
    temp = getnode();
    temp -> info =item;
    if(last == NULL){
        temp -> link = temp;
        return temp;
    }
    else{
        temp -> link = last -> link;
        last -> link = temp;
        return temp;
    }
}

NODE delete_front(NODE last){
    NODE first;
    if(last == NULL){
        printf("List is empty");
        return last;
    }
    if(last -> link = last){
        printf("deleted node is :  %d",last -> info);
        free (last);
        return NULL;
    }
    first = last -> link;
    last -> link = first -> link;
    printf("\n deleted item is : %d", first -> info);
    free (first);
    return last;
}

void display(NODE last){
    NODE temp;
    if(last == NULL){
        printf("list is empty\n");
        return;
    }
        printf("The elements are:\n");
        temp = last -> link;
        while(temp != last){
        printf("%d -> ", temp -> info);
        temp = temp -> link;
    }
    printf("%d", temp -> info);
}

int main(){
    int item,ch;
    NODE last = NULL;
            while(1){
                printf("\nMENU OPERATIONS ON CIRCULAR LINKED LIST\n");
                printf("1.INSERT-FRONT\n");
                printf("2.DELETE\n");
                printf("3.DISPLAY\n");
                printf("4.EXIT\n");

                printf("enter your choice\n");
                scanf("%d.", &ch);

            switch(ch)
            {
                case 1 : printf("enter element :");
                         scanf("%d",&item);
                         last=insert_rear(item, last);
                         break;
                case 2 : last = delete_front(last);
                         break;
                case 3 : display(last);
                         break;
                case 4 : exit(0);
                         break;
                default : printf("invalid choice");
        }
    }
    return 0;
}