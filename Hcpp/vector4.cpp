#include<iostream>
#include<vector>
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
    cout<<"enter the value to be checked"<<endl;
    int x;
    cin>>x;
    int occ=-1;
    for(int i=0;i<6;i++)
    {
        if(v[i]==x)
        {
            occ=i;
        }
    }
    cout<<"occurance is "<<occ<<endl;
    return 0;
}