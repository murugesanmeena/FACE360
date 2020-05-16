#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
  char a[100000];
  scanf("%[^\n]s",a);
  int i,x;
  x=strlen(a);
  for(i=0;i<x;i++){
    if(a[i]=='t'&&a[i+1]=='h'&&a[i+2]=='e') i+=4;
    printf("%c",a[i]);
  }  
}