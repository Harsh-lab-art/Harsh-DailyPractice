#include<iostream>
using namespace std;
class Solution
{
    public:
    int findTargetSumWays(int [] nums, int target) 
    {
       return ways(nums,target,0,0); 
    }
    int ways(int nums[],int target,int idx,int curr)
    {
       if(idx==nums.length)
       {
         return curr==target?1:0;
       }
       int add=ways(nums,target,idx+1,curr+nums[idx]);
       int sub=ways(nums,target,idx+1,curr-nums[idx]);
       return add+sub; 
    }
};
int main()
{
    Solution obj;
    int arr[]={1,1,1,1,1};
    int target=3;
    cout<<obj.findTargetSumWays(arr,target)<<endl;

    int arr2[]={1};
    int target2=1;
    cout<<obj.findTargetSumWays(arr2,target2)<<endl;
}
