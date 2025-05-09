#include<iostream>
#include<vector>
#include<string>
#include<unordered_map>
using namespace std;
int main()
{
    int arr[]={3,4,8,7,1,8,4,5,3,9,0,2,1,4,6,4,3,8,7,6,5,4,3,2,1,0,8,7,9,5,4,3,7,7,0,0,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    int tar=9;
    int trip=0;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(arr[i]+arr[j]+arr[k]==tar)
                {
                    trip++;
                }
            }
        }
    }
    cout<<"triplet is : "<<trip<<endl;
    return 0;
}