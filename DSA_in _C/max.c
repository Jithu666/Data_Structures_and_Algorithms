
#include<stdio.h>
int main(){
    int arr[] = {3, 7, 1, 9, 5};
    int n = sizeof(arr)/sizeof(arr[0]);

    // printf("enter the size of the array");
    // scanf("%d", &n);
    // printf("enter the values of the array");
    // scanf("%d", &arr[i])
    for(int i = 0;i < n; i++){
        for(int j = i+1; j < n; j++){
            if(arr[i] < arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        printf("sorted array : ");
        for(int i = 0; i < n; i++)
        printf("%d", arr[i]);
    } 
    printf("\n");
    int secondLargest = arr[1];
    printf("second largest element in the array : %d\n", secondLargest);
    int secondSmallest = arr[3];
    printf("second smallest element in the array : %d\n", secondSmallest);
    return 0;
}