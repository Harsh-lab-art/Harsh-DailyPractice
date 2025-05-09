//check for sorted
#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
using namespace std;
int main()
{
    vector<int>v;
    for(int i=0;i<6;i++)
    {
        int ele;
        cin>>ele;
        v.push_back(ele);
    }
    bool flag=false;
    for(int i=0;i<v.size();i++)
    {
        if(v[i]<=v[i+1])
        {
            return true;
        }
        
    }
    return 0;
}