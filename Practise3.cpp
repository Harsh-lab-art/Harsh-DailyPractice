#include<iostream>
using namespace std;
int main()
{
    int n,m;
    cout<<"enter the number of rows"<<endl;
    cin>>n;
    cout<<"enter the number of coloums"<<endl;
    cin>>m;
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=m;j++ )
        {
            if(i==0||j==0||i==n||j==m)
            {
                cout<<j;
            }
            else
            {
                cout<<" ";
            }
        }
        cout<<endl;
    }
}
