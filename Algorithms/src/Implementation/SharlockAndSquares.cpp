#include <iostream>
#include <cmath>

using namespace std;

int count_squares(int a, int b) {

    int squares = 0;
    int i = 0;

    for(;i*i <= b; ++i) {
        if((i*i) >= a) {
            ++squares;
        }
    }

    return squares;
}

int main() {
    int testCases;
    cin >> testCases;

    for(int i = 0; i < testCases; ++i) {
        int a, b;
        cin >> a >> b;

        cout << count_squares(a, b) << endl;
    }

}
