#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,m=0,n=0,o=0,i,j;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++) for(j=0;j<c;j++) cin>>a[i][j];
  for(i=0;i<=0;i++) for(j=0;j<c-1;j++) m+=a[i][j];
  for(j=c-1;j==c-1;j--) for(i=0;i<r;i++) n+=a[j][i];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if(i+j==r-1) o+=a[i][j];
      if(j==0 && i==r-1) n-=a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<o+n+m;
}