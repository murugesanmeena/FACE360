#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,i,j,c;
  cin>>r>>c;
  int a[r][c],m=0;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++) 
      cin>>a[i][j];
  for(i=0;i<r;i++){
    m=0;
    for(j=0;j<c;j++) m+=a[i][j];
    cout<<m<<"\n";
      }
  
}