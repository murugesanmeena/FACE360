#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
void strrev(char* s)
{
  int i=0,j=0;
  while(s[j+1]) j++;
  while(i<j){
    char t=s[i];
    s[i]=s[j];
    s[j]=t;
    i++;
    j--;
  } 
}
int main(){
  char a[101],b[101];
  gets(a);
  gets(b);
  strrev(a);
  if(strcmp(a,b)==0) cout<<"It is correct";
  else cout<<"It is wrong";
  return 0;
} 