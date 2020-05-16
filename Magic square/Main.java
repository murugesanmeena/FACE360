#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,n,f=0,b=0;
  cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      scanf("%d ",&a[i][j]);
  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      if(i==j) f+=a[i][j];
      if(i+j==n-1) b+=a[i][j];
    }
  }
  if(f==b) cout<<"Yes";
  else cout<<"No";
}