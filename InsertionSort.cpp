#include<iostream>
using namespace std;

void insertSort(int arr[],int n)
{
    for(int i=0;i<n;++i)
    {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
          arr[j+1]=arr[j];
          j=j-1;
        }
        arr[j+1]=key;
    }
}
void print(int arr[],int n)
{
    for(int i=0;i<n;++i)
    {
       cout<<arr[i];
    }
    cout<<endl;
}

int main()
{
    int n;
    cout<<"enter the size of array"<<endl;
    cin>>n;
    int arr[n];
    cout<<"enter the elements in array"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    insertSort(arr,n);
    print(arr,n);
    return 0;


}
