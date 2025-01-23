#include<iostream>
using namespace std;
class stack
{
    private:
    int* sarr;
    int maxsize;
    int top;
    public:
    stack(int size);
    ~stack();
    void push(int ele);
    int pop();
    bool isEmpty();
    void display();
};
stack::stack(int size)
{
    maxsize=size;
    sarr=new int[maxsize];
    top=-1;
}
stack::~stack()
{
    delete[]sarr;
}
void stack::push(int ele)
{
    if(top>=maxsize-1)
    {
        cout<<"Stack Overflow! cannot push elements"<<ele<<endl;
    }
    else
    {
        sarr[++top]=ele;
        cout<<ele<<" pushed in stack "<<endl;
    }
}
int stack::pop()
{
    if(isEmpty())
    {
        cout<<"Stack Underflow!,cannot pop from an empty stack "<<endl;
        return -1;
    }
    else
    {
        return sarr[top--];
    }
}
bool stack::isEmpty()
{
    return top==-1;
}
void stack::display()
{
    if(isEmpty())
    {
        cout<<" Stack is empty "<<endl;
    }
    else
    {
        cout<<"Stack elements are "<<endl;
        for(int i=top;i>=0;i--)
        {
            cout<<sarr[i]<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    int size;
    cout<<"enter the size of the stack :";
    cin>>size;
    stack str(size);
    int choice,ele;
    do
    {
        cout<<"\nMenu:\n";
        cout<<"1.Push\n";
        cout<<"2.Pop\n";
        cout<<"3.Display\n";
        cout<<"4 Exit\n";
        cout<<"Enter your choice";
        cin>>choice;
        switch(choice)
        {
            case 1:
               cout<<"Enter element to push in stack\n";
               cin>>ele;
               str.push(ele);
            break;
            case 2:
               ele=str.pop();
               if(ele!=-1)
                {
                  cout<<ele<<"popped form stack"<<ele;
                }
            break;
            case 3:
               str.display();
            break;
            case 4:
               cout<<"Exiting from program"<<endl;
            break;
            default:
               cout<<"Invalid choice! enter another choice : ";   
            break;   
        }
    }
    while(choice!=4);
    return 0;
}
