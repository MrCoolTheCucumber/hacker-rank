#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int T;
    cin >> T;
    for(int i = 0; i < T; ++i) {
        unsigned int a;
        cin >> a;
        cout << ~a << endl;
    }
    return 0;
}