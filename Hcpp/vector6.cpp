#include<iostream>
#include<vector>
using namespace std;
int main()
{


vector<int>v;
for(int i=0;i<5;i++)
{
    int ele;
    cin>>ele;
    v.push_back(ele);
}
int x;
cout<<"enter the value to be checjed"<<endl;
cin>>x;
int c=0;
for(int i=0;i<v.size();i++)
{
    if(v[i]>x)
    {
        c++;
    }
}
cout<<c<<endl;
return 0;
}