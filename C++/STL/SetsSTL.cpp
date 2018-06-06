#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;

int main() {
    unsigned int q;
    cin >> q;

    set<int> s;

    for(int i = 0; i < q; ++i) {
        int t, n;
        cin >> t >> n;

        switch (t) {
            case 1:
                s.insert(n);
                break;
            case 2:
                s.erase(n);
                break;
            case 3:
                string output = s.find(n) != s.end() ? "Yes" : "No";
                cout << output << endl;
                break;
        }
    }

    return 0;
}
