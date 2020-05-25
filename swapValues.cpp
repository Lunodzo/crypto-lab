#include <stdio.h>
void swap(int, int);

//A function to interchange *px and *py
void swap(int *px, int *py){
    int temp;
    temp = *px;
    *px = *py;
    *py = temp;
}
int main(int argc, char const *argv[])
{
    //Function call, ignore the parameters
    //Define variables with their addresses
    swap(5, 8);//Ignore the values, use addresses
    return 0;
}
