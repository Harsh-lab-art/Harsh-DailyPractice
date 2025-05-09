#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
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
    int sum=0;
    for(int i=0;i<v.size();i++)
    {
        if(i%2==0)
        {
            sum=sum+v[i];
        }
        else
        {
            sum=sum-v[i];
        }
    }
    cout<<"sum is : "<<sum<<endl;
    return 0;
}