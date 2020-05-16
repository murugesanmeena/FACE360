#include<iostream>
#include<math.h>
using namespace std;
struct comp{
  float r,i;
}x,y;
int main(){
  float a,b;
  int k;
  cin>>k>>x.r>>x.i>>y.r>>y.i;
  if(k==1){
    a=(x.r)+(y.r);
    b=(x.i)+(y.i);
    cout<<a<<"+"<<b<<"i";
  }else if(k==2){
    a=x.r-y.r;
    b=x.i-y.i;
    cout<<a<<"+"<<b<<"i";
  }else if(k==3){
    a=x.r*y.r-x.i*y.i;
    b=x.r*y.i+x.i*y.r;
    cout<<a<<b<<"i";
  }else cout<<"Invalid choice";  
} 