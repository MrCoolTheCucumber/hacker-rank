#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(const string &str) {
    stringstream stream(str);
    int a;
    vector<int> v;
    while(stream >> a) {
        v.push_back(a);

        if(stream.peek() == ',') {
            stream.ignore();
        }
    }

    return v;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }

    return 0;
}