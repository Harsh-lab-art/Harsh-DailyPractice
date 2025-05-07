#include<iostream>
#include<vector>
using namespace std;
int main()
{
    vector<int>v;
    cout<<"size "<<v.size()<<endl;
    v.push_back(5);
    cout<<"size"<<v.size()<<endl;
    v.push_back(7);
    v.push_back(3);
    cout<<"size"<<v.size()<<endl;
    v.insert(v.begin()+1,6);
    v.insert(v.end()-2,9);
    v.pop_back();
    v.erase(v.end()-1);
    v.erase(v.begin());
    v.clear();
    for(int i=0;i<v.size();i++)
    {
        cout<<v[i]<<endl;
    }
    return 0;
}