#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,s=0,k;
  cin>>n>>m;
  for(int i=0;i<n;i++){
    cin>>k;
    s+=k;
  }
  if(s==m) cout<<"1";
  else cout<<1+s/m;
}