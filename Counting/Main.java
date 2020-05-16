#include<iostream>
using namespace std;
int main()
{
  char a[200];
  int i,v,c,d,s,y;
  v=c=d=s=y=0;
  cin.getline(a,200);
  for(i=0;a[i]!='\0';++i){
    if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'|| a[i]=='O'||a[i]=='U') ++v;
    else if((a[i]>='a'&& a[i]<='z')||(a[i]>='A' &&a[i]<='Z') )++c;
    else if(a[i]>='0'&&a[i]<='9') ++d;
    else if(a[i]==' ')++s;
    else ++y;
            }cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<s<<"\nDigits:"<<d<<"\nSymbols:"<<y;          
            
}