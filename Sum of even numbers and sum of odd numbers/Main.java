#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[100],e=0,o=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++) scanf("%d\n",&a[i]);
  for(int i=0;i<n;i++){
    if(a[i]%2==0) e+=a[i];
    else o+=a[i];
  }
  printf("The sum of the even numbers in the array is %d\nThe sum of the odd numbers in the array is %d",e,o);
}