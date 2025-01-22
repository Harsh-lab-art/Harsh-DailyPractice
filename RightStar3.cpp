#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter the valuse of n"<<endl;
    cin>>n;
    for(int i=0;i<=n;i++)
    {
      for(int j=n;j>=0;j--)
      {
        if((n-j)==i)
        {
            cout<<"  ";
        }
        else
        {
            cout<<"* ";
        }
      }
      cout<<" "<<endl;
    }
    return 0;
}
