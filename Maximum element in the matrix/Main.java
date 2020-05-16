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
  int max=0;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if(a[i][j]>max) max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
  
  
}