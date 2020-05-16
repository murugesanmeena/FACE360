#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,a,i,flag=0;
  cin>>n>>m;
  for(i=0;i<n;i++){
    cin>>a;
    flag+=a;
  }
  flag>m?cout<<"NO":cout<<"YES";
}