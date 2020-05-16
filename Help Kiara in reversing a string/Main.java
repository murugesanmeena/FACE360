#include <iostream>
#include<string.h>
int main()
{
char str[100], t;   
  gets(str);
int count = 0, end, i,j=strlen(str)-1;  
  for(int i=0;i<j;i++,j--){
    t=str[j];
    str[j]=str[i];
    str[i]=t;
  }std::cout<<str;  
             

}