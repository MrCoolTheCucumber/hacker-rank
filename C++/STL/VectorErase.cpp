#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    unsigned int n;
    cin >> n;
    vector<int> vec(n);

    for(auto &e: vec) {
        cin >> e;
    }

    int i, a, b;
    cin >> i >> a >> b;

    vec.erase(vec.begin() + i - 1);
    vec.erase(vec.begin() + a - 1, vec.begin() + b - 1);

    cout << vec.size() << endl;

    for(auto e: vec) {
        cout << e << " ";
    }
    return 0;
}
