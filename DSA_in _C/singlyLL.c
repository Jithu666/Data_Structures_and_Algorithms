#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    struct node *link;
};
typedef struct node * NODE;

NODE getnode(){
    return ((struct node*)malloc(sizeof (struct node)));
}

NODE insert_front(int item, NODE first){
    NODE temp;
    temp = getnode();
    temp -> info =item;
    temp -> link = first;
    return temp;
}

NODE insert_position(NODE first, int pos, int item){
    NODE cur, temp;
    int i;
    temp = getnode();
    temp -> info = item;
    cur = first;
    if(pos == 1){
        temp -> link = first;
        return temp;
    }

    else{
        for(i = 1; i < pos - 1 && cur != NULL; i++){
            cur = cur -> link;
        }
        if(cur != NULL){
            temp -> link = cur -> link;
            cur -> link = temp;
            return first; 
        }
        else{
            printf("wrong position \n");
            return first;   
        }
    }
}


NODE delete_rear(NODE first){
    NODE cur, prev = NULL;
    if(first == NULL){
        printf("list is empty\n");
        return first;
    }
    if(first -> link == NULL){
        cur = first;
        first = NULL;
        printf("deleted element is -> %d", cur->info);
        free (cur);
        return (first);
    }

    cur = first;
    while(cur -> link != NULL){
        prev = cur;
        cur = cur -> link;
    }
    prev -> link = NULL;
    printf("Deleted element is %d", cur -> info);
    free (cur);
    return first;
}

NODE delete_pos(NODE first, int pos){
    NODE cur, prev;
    int i;
    if(first == NULL){
        printf("\n list is empty \n");
        return (first);
    }
    prev = NULL;
    cur = first;
    if(pos == 1){
        cur = cur -> link;
        printf("deleted element is %d", first -> info);
        free (first);
        return (cur);
    }
    else{
        for(i = 1; i < pos && cur != NULL; i++){
            prev = cur;
            cur = cur -> link;
        }
    if(cur != NULL){
        prev -> link = cur -> link;
        printf("\n deleted element %d", cur -> info);
        free (cur);
        return first;
    }
    else{
        printf("\n wrong position");
        return first;
        }
    }
}

NODE display(NODE first){
    NODE temp;
    if(first == NULL){
        printf("list is empty");
        return first;
    }
    temp = first;
    printf("The elements in the list are :");
    while(temp != NULL){
        printf("%d -> ", temp -> info);
        temp = temp -> link;
    }
    printf("\n");
}


int main()
    {
        int item, pos, ch;
        NODE first = NULL;
            while(1){
                printf("MENU OPERATIONS ON SINGLY LINKED LIST\n");
                printf("1.INSERT-FRONT\n");
                printf("2.INSERT-AT-GIVEN-POSITION\n");
                printf("3.DELETE-REAR\n");
                printf("4.DELETE-AT-A-GIVEN-POSITION\n");
                printf("5.DISPLAY\n");
                printf("6.EXIT\n");

                printf("enter your choice\n");
                scanf("%d.", &ch);

            switch(ch)
            {
                case 1 : printf("enter element :");
                        scanf("%d",&item);
                        first=insert_front(item, first);
                        break;
                case 2 : printf("enter element :");
                        scanf("%d",&item);
                        printf("\n enter position :");
                        scanf("%d", &pos);
                        first = insert_position(first,pos,item);
                        break;
                case 3 : first = delete_rear(first);
                        break;
                case 4 : printf("\n enter position");
                        scanf("%d", &pos);
                        first = delete_pos(first, pos);
                        break;
                case 5 : display(first);
                        break;
                case 6 : exit(0);
                        break;
                default : printf("\n INVALID CHOICE");  
                        break;
            }
        }
    return 0;
}