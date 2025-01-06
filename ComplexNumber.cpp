#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public: 
    Complex(){

    };

    Complex(int real, int img)
    {
        this->real = real;
        this->img = img;

    };
    void display()
    {
        cout<<real<<"+i"<<img<<endl;
    }
    Complex operator-(Complex &C)
    {
        Complex temp;
        temp.real =real-C.real;
        temp.img=real-C.img;
        return temp;

    }
};

int main(){
    Complex C1(9,8);
    Complex C2(6,5);
    Complex C3=C1-C2; 
    C3.display();


    return 0;


}
