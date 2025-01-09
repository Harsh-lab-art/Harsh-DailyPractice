#include<iostream>
using namespace std;
class ListNode 
{
  public:
  int val;
  ListNode* next;
  ListNode(int data)
  {
    val= data;
    next=NULL;
  }
};
class Solution
{
    public:
    ListNode*list;
    Solution()
    {
        list=NULL;
    }
    void insertAtTail(int value)
    {
        ListNode* new_node=new ListNode(value);
        if(list==NULL)
        {
            list=new_node;
            return;
        }
        ListNode*temp=list;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=new_node;
    }
    void display()
    {
        ListNode*temp=list;
        while(temp!=NULL)
        {
            cout<<temp->val<<"->";
            temp=temp->next;
        }
        cout<<"NULL"<<endl;
    }
};
ListNode* mergeTwoLists(ListNode* &list1, ListNode* &list2) 
{
    ListNode* dummyList=new ListNode(-1);
    ListNode* ptr1=list1;
    ListNode* ptr2=list2;
    ListNode* ptr3=dummyList;
    while(ptr1&&ptr2)
    {
        if(ptr1->val<ptr2->val)
        {
            ptr3->next=ptr1;
            ptr1=ptr1->next;
        }
        else
        {
            ptr3->next=ptr2;
            ptr2=ptr2->next;
        }
        ptr3=ptr3->next;
    }
    if(ptr1)
    {
        ptr3->next=ptr1;
    }
    else
    {
        ptr3->next=ptr2;
    }
    return dummyList->next;
}
int main()
{
   Solution ll1;
    ll1.insertAtTail(1);
    ll1.insertAtTail(2);
    ll1.insertAtTail(4);
    cout<<"list 1 is "<<endl;
    ll1.display();

    Solution ll2;
    ll2.insertAtTail(1);
    ll2.insertAtTail(3);
    ll2.insertAtTail(4);
    cout<<"list 2 is "<<endl;
    ll2.display();

    Solution ll3;
    ll3.list=mergeTwoLists(ll1.list,ll2.list);
    cout<<"Merged sorted  list is "<<endl;
    ll3.display();
    return 0;
}
