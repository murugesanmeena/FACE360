#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,p,x;
  cin>>n;
  int a[n+1];
  for(int i=1;i<=n;i++) cin>>a[i];
  cin>>p>>x;
  cout<<"Enter the number of elements in the array\nEnter the elements in the array\nEnter the location where you wish to insert an element\n";
  if (p<n) cout<<"Enter the value to insert\nArray after insertion is\n";
  else cout<<"Invalid Input";
  for(int i=1;i<=n;i++){
    if(n<p) break;
    else if(i==p) cout<<x<<"\n";
    cout<<a[i]<<"\n";
  }
    
}