#include "iostream";

using namespace std;

int main()
{

    double input;
    // while (input != -1)
    // {
    //     cout << "enter your inches" << endl;
    //     cin >> input;
    //     input = input/0.03937;
    //     cout << input <<endl;

    // }
    // while(true){
    //     cout << "Enter the m"<< endl;
    //     cin>> input;
    //     input = input *100*10;
    //     cout << "Your answer in mm is : "<< input << endl;
    // }
    while (true)
    {
        cout << "Enter the cm" << endl;
        cin >> input;
        input = input *0.39370;
        cout << input << endl;
        
    }