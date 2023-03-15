#include<stdio.h>

int main()
{
    int arr[3];
    for (size_t i = 0; i < 3; i++)
    {
        printf("Enter 3 element : "); scanf("%d",&arr[i]);
    }
    for (size_t i = 3; i > 0; i--)
    {
        printf("%d",arr[i-1]);
        /* code */
    }
    
nullptr
}