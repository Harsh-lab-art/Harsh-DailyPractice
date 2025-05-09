//elements strictly greater then x
#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
using namespace std;
int main()
{
    vector<int>v;
    for(int i=0;i<10;i++)
    {
        int ele;
        cin>>ele;
        v.push_back(ele);
    }
    int x;
    cout<<"enter x"<<endl;
    cin>>x;
    for(int ele:v)
    {
        if(ele>x)
        {
            cout<<"greater is "<<ele<<endl;
        }
    }
    return 0;
}