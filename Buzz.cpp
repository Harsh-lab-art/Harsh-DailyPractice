#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the number"<<endl;
    cin>>n;
    int c=0;
    for(int i=0;i<n;i++)
    {
        if(i%5==0&&i%7==0)
        {
            cout<<i<<endl;
            
        }
    }
    return 0;
}
