#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int>v;
   for(int i=0;i<5;i++)
   {
      cout<<"enter the element"<<endl;
        int ele;
       cin>>ele;
        v.push_back(ele);
   }
    //for(int i=0;i<v.size();i++)
    //{
      //  cout<<v[i]<<" "<<endl;
    //}
    for(int e:v)
    {
        cout<<e<<" ";
    }
    cout<<endl;
    return 0;
}