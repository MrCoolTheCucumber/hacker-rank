#include <iostream>

using namespace std;

int main() {

    int c;
    cin >> c;

    string s;

    switch (c) {
        case 1:
            s = "one";
            break;
        case 2:
            s = "two";
            break;
        case 3:
            s = "three";
            break;
        case 4:
            s = "four";
            break;
        case 5:
            s = "five";
            break;
        case 6:
            s = "six";
            break;
        case 7:
            s = "seven";
            break;
        case 8:
            s = "eight";
            break;
        case 9:
            s = "nine";
            break;
        default:
            s = "Greater than 9";
    }

    cout << s << endl;

    return 0;
}

