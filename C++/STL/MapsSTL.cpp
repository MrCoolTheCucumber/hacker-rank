#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;


int main() {
    unsigned int q;
    cin >> q;

    map<string, int> map;

    for(int i = 0; i < q; ++i) {
        int t, m;
        string p;
        cin >> t >> p;

        if(t == 1) {
            cin >> m;
            map[p] += m;
        }
        else if(t == 2) {
            map[p] = 0;
        }
        else {
            cout << map[p] << endl;
        }
    }

    return 0;
}
