#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct Student{
  char name[30],dept[20];
  int year;
  float cgpa;
};
int comparator(const void* p, const void* q){
  return strcmp(((struct Student*)p)->name,((struct Student*)q)->name);
}  
int main()
{
  int n;
  char t[20];
  cout<<"Enter the number of students\n";
  cin>>n;
  struct Student s[n];
  for(int i=0;i<n;i++){
    cout<<"Enter the details of student "<<i+1<<"\nEnter name\nEnter department\nEnter year of study\nEnter cgpa\n";
    cin>>s[i].name>>s[i].dept>>s[i].year>>s[i].cgpa;
  }qsort(s,n,sizeof(struct Student),comparator);
  cout<<"Details of students\n";
  for(int i=0;i<n;i++){
    cout<<"Student "<<i+1<<"\nName:"<<s[i].name<<"\nDepartment:";
    puts(s[i].dept);
    cout<<"Year of study:"<<s[i].year<<"\nCGPA:"<<s[i].cgpa<<"\n";
  }return 0;  
}