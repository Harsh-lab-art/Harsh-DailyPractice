#include<iostream>
using namespace std;
class Node
{
    public:
    int val;
    Node*next;
    Node(int data)
    {
       val=data;
       next=NULL; 
    }
};
void insertatHead(Node* &head,int val)
{
    Node* nn=new Node(val);
    nn->next=head;
    head=nn;
}
void insertatTail(Node* &head,int val)
{

    Node*nn=new Node(val);
    Node*temp=head;
    while(temp->next!=NULL)
    {
      temp=temp->next;
    }
    temp->next=nn;
    nn->next=NULL;
}
void insertatpos(Node* &head,int val,int pos)
{
    if(pos==0)
    {
       insertatHead(head,val);
       return; 
    }
    Node*nn=new Node(val);
    Node*temp=head;
    int currpos=0;
    while(currpos!=pos-1)
    {
        temp=temp->next;
        currpos++;
    }
    nn->next=temp->next;
    temp->next=nn;
}
void display(Node*&head)
{
    Node*temp=head;
    while(temp!=NULL)
    {
        cout<<temp->val<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
void updateatpos(Node* &head,int val,int k)
{
    Node* temp=head;
    int currpos=0;
    while(currpos!=k)
    {
        temp=temp->next;
        currpos++;
    }
    temp->val=val;
}
void deleteatHead(Node*&head)
{
    Node*temp=head;
    head=head->next;
    free(temp);

}
void deleteatTail(Node*&head)
{
    Node*secondlast=head;
    while(secondlast->next->next!=NULL)
    {
        secondlast=secondlast->next;
    }
    Node*temp=secondlast->next;
    secondlast->next=NULL;
    free(temp);
}
void deleteatpos(Node*&head,int pos)
{
    if(pos==0)
    {
        deleteatHead(head);
        return;
    }
    int currpos=0;
    Node*prev=head;
    while(currpos!=pos-1)
    {
        prev=prev->next;
        currpos++;
    }
    Node*temp=prev->next;
    prev->next=prev->next->next;
    free(temp);
}
int main()
{
    Node*head=NULL;
    insertatHead(head,5);
    display(head);
    insertatHead(head,3);
    display(head);
    insertatTail(head,6);
    display(head);
    insertatpos(head,1,0);
    display(head);
    insertatpos(head,2,1);
    display(head);
    insertatpos(head,4,3);
    display(head);
    insertatTail(head,7);
    display(head);
    insertatTail(head,10);
    display(head);
    insertatpos(head,8,7);
    display(head);
    insertatpos(head,9,8);
    display(head);
    updateatpos(head,15,8);
    display(head);
    deleteatHead(head);
    display(head);
    deleteatHead(head);
    display(head);
    deleteatTail(head);
    display(head);
    deleteatpos(head,5);
    display(head);
    deleteatpos(head,4);
    display(head);
    deleteatpos(head,3);
    display(head);
    deleteatpos(head,2);
    display(head);
    deleteatpos(head,1);
    display(head);
    deleteatpos(head,0);
    display(head);
    return 0;
}
