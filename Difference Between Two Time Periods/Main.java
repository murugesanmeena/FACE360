#include<iostream>
#include<stdio.h>
using namespace std;
struct time{
  int h,m,s;
};
void dif(struct time t1,struct time t2, struct time *diff);
int main()
{
  struct time a,b,d;
  cin>>a.h>>a.m>>a.s>>b.h>>b.m>>b.s;
  dif(a,b,&d);
  cout<<d.h<<":"<<d.m<<":"<<d.s;
  return 0;
}
void dif(struct  time x,struct time y, struct time *z){
  if(y.s>x.s){
    --x.m;
    x.s+=60;
  }z->s=x.s-y.s;
  if(y.m>x.m){
    --x.h;
    x.m+=60;
  }z->m=x.m-y.m;
  z->h=x.h-y.h;
}  