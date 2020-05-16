#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[100],b[100];
  cin>>a>>b;
  if(strcmp(a,b)) cout<<"It is wrong";
  else cout<<"It is correct";
}