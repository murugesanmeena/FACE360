#include<iostream>
using namespace std;
struct dist{
  int f;
  float i;
}d1,d2,sum; 
int main()
{
  cin>>d1.f>>d1.i>>d2.f>>d2.i;
  sum.f=d1.f+d2.f;
  sum.i=d1.i+d2.i;
  if(sum.i>12.0){
    sum.i-=12.0;
    ++sum.f;
  }  cout<<sum.f<<"'-"<<sum.i<<"\"";
  return 0;
}