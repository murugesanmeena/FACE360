#include <cstring>
#include <iostream>
int main()
{
   char s[200];
  int c=0,i;
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0';i++){
    if(s[i]==' '&&s[i+1]!=' ') c++;
  }if(c<9) printf("Caption eligible for the contest");
  else printf("Caption not eligible for the contest");
   
}