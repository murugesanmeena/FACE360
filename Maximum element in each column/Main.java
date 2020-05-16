#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,r,c;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      scanf("%d ",&a[i][j]);
  for(i=0;i<c;i++){
    int max=a[0][i];
    for(j=0;j<r;j++){
      if(a[j][i]>max) max=a[j][i];
    }
    printf("%d\n",max);
  }
}