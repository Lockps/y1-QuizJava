#include<stdio.h>

int main(int argc, char const *argv[])
{
    int a[10], *p;
    p = a ;
    for (int i = 0; i < 10; i++)
    {
        *p = i+1;
        *p++;
    }

    p = a ;

    for (size_t i = 0; i < 10; i++)
    {
        printf(" a = %d\n",*p++);
    }

    for (size_t i = 0; i < 10; i++)
    {
        printf("%d\n",a[i]);
    }
    
    
    
    return 0;
}
