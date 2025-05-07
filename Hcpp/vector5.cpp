#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int>v(6);
    for(int i=0;i<v.size();i++)
    {
        cin>>v[i];
    }
    int occ=0;
    cout<<"enter the element to be found";
    int x;
    cin>>x;
    for(int i=0;i<v.size();i++)
    {
        if(v[i]==x)
        {
            occ++;
        }
    }
    cout<<occ<<endl;
    return 0;
}