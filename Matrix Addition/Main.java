#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r,c;
  cin>>r>>c;
  int a[r][c],b[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      scanf("%d\n",&a[i][j]);
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      scanf("%d\n",&b[i][j]);
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      printf("%d ",a[i][j]+b[i][j]);
    }
  printf("\n");
}
  
}