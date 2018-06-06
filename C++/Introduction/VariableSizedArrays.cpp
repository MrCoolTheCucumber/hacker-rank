#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    unsigned int n, q;
    cin >> n >> q;

    vector<vector<int>> vec(n);

    for(int i = 0; i < n; ++i) {
        unsigned int size;
        cin >> size;

        while(size-->0) {
            int k;
            cin >> k;
            vec[i].push_back(k);
        }
    }

    for(int i = 0; i < q; ++i) {
        int a, b;
        cin >> a >> b;

        cout << vec[a][b] << endl;
    }
    return 0;
}
