#include<iostream>
#include<string.h>
using namespace std;
struct College{
  char name[100],city[100];
  int year;
  float percent;
};
int comparator(const void* p, const void* q) {
  return strcmp(((struct College*)p)->name,((struct College*)q)->name);
}  
int main()
{
  int n;
  char t[100];
  cout<<"Enter the number of colleges\n";
  cin>>n;
  struct College c[n];
  for(int i=0;i<n;i++){
    cout<<"Enter the details of college "<<i+1<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage\n";
    cin>>c[i].name>>c[i].city>>c[i].year>>c[i].percent;
  }qsort(c,n,sizeof(struct College),comparator);
  cout<<"Details of colleges\n";
  for(int i=0;i<n;i++){
    cout<<"College:"<<i+1<<"\nName:"<<c[i].name<<"\nCity:";
    puts(c[i].city);
    cout<<"Year of establishment:"<<c[i].year<<"\nPass percentage:"<<c[i].percent<<"\n";
  }return 0;
}