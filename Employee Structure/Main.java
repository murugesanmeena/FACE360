#include<iostream>
using namespace std;
struct employee{
  char name[30],dest[30];
  int empid,age,salary;
};  
int main()
{
  struct employee emp;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\n";
  cin>>emp.name>>emp.empid>>emp.age>>emp.dest>>emp.salary;
  cout<<"Employee Details\nName of the Employee : "<<emp.name<<"\nID of the Employee : "<<emp.empid<<"\nAge of the Employee : "<<emp.age<<"\nDesignation of the Employee : "<<emp.dest<<"\nSalary of the Employee : "<<emp.salary;
  
}