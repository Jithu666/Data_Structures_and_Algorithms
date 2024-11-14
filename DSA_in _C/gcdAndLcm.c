#include<stdio.h>
#include<stdlib.h>

int main(){
    int m,n,gcd,lcm;
    printf("enter the values for m and n");
    scanf("%d%d",&m,&n);
    if(m<n){
        int temp=m;
        m=n;
        n=temp;
    }
        gcd=GCD(m,n);
        lcm=(m*n)/gcd;
        printf("the GCD of m and n is %d ", gcd);
        printf("the lcm of m and n is %d ", lcm);
    return gcd;
    }
    int GCD(int m, int n){
        if(n==0)
        return m;
        else
        return GCD(n,m%n);
    }
