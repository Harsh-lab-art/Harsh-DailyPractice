//check if given sorted or not
#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
using namespace std;
int main()
{
    int arr[]={2,3,5,4,6,1,7,8};
    int n=sizeof(arr)/sizeof(arr[0]);
    bool flag=false;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<arr[i+1])
        {
            flag=true;
        }
    }
    cout<<flag<<endl;
    return 0;
}