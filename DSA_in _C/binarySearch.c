#include<stdio.h>

int main(){
    int a[10],n,flag,i,key;
    printf("enter the value of n");
    scanf("%d",&n);
    printf("enter the elements in ascending order");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("enter the element to search");
    scanf("%d",&key);
    flag=binarySearch(a,0,n-1,key);
    if(flag==1)
    printf("element is found");
    if(flag==-1)
    printf("the element is not found");
    return;
}
int binarySearch(int a[],int low, int high, int key){
    int mid;
    mid=(low+high)/2;
    if(a[mid]==key)
    return 1;
    else if(key>a[mid])
    return binarySearch(a,mid+1,high,key);
    else if(key<a[mid])
    return binarySearch(a,low,mid-1,key);
    else
    return -1;
    
}