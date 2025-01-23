#include<iostream>
using namespace std;
class student
{
    private:
    int roll_number;
    char section;
    float total=0,english,maths,science;
    public:
    void input()
    {
        cout<<"enter the  sectionn of the student "<<endl;
          cin>>section;
            cout<<"enter the roll numbeer of the student"<<endl;
              cin>>roll_number;
                cout<<"enter the marks in english"<<endl;
                  cin>>english;
                    cout<<"enter the marks in maths"<<endl;
                       cin>>maths;
                        cout<<"enter the marks in science"<<endl;
                           cin>>science;
    }
    void ctotal()
    {
      total=english+maths+science;
    }
    void print()
    {
        cout<<"section of the student is : "<<section <<endl;
          cout<<"Roll number of the student is : "<<roll_number <<endl;
            cout<<"marks inn english is : "<<english <<endl;
              cout<<"marks in maths is : "<<maths <<endl;
                cout<<"marks in science is : "<<science <<endl;
                  cout<<"total marks obtain is : "<<total <<endl;
    }
};
    int main()
    {
        student obj;
        obj.input();
        obj.ctotal();
        obj.print();
        return 0;
    }
