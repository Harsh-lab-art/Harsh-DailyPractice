#include<iostream>
#include<vector>
#include<string>
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
    int occ=0;
    int x;
    cout<<"enter the value  to be searched"<<endl;
    cin>>x;
    for(int el:v)
    {
        if(el==x)
        {
            occ++;
        }
    }
    cout<<"occurance is "<<occ<<endl;
    return 0;
}