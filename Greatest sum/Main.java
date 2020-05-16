#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c],n[100]={},m[100]={},x=0,y=0;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      n[j]+=a[i][j];
  for(j=0;j<c;j++)
    for(i=0;i<r;i++) 
      m[i]+=a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++){
    cout<<m[i]<<" ";
    if(m[i]>x){
      x=m[i];
      y=i;
    }
  }
  cout<<"\nRow "<<y+1<<" has maximum sum\nSum of columns is ";
  x=0;
  for(int i=0;i<c;i++){
    cout<<n[i]<<" ";
    if(n[i]>x){
      x=n[i];
      y=i;
    }
  }
  cout<<"\nColumn "<<y+1<<" has maximum sum";
}