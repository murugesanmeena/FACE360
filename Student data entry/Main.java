#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  std::cout<<"\nStudent Details\nName: ";
  gets(s.name);
  std::cin>>s.roll>>s.marks;
  std::cout<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
}