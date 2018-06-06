#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    unsigned int n;
    cin >> n;
    vector<int> v(n);

    for(int i = 0; i < n; ++i) {
        cin >> v[i];
    }

    unsigned int q;
    cin >> q;

    for(int i = 0; i < q; ++i) {
        unsigned int m;
        cin >> m;

        auto lb = lower_bound(v.begin(), v.end(), m);
        string yn = *lb == m ? "Yes" : "No";

        cout << yn << " " << distance(v.begin(), lb) + 1 << endl;
    }

    return 0;
}
