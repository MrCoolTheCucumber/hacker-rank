#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <stack>
#include <cassert>

using namespace std;


int main() {
    unsigned int N, Q;
    cin >> N >> Q;
    cin.ignore();
    // N -> number of lines
    // Q -> number of queries

    vector<string> hrml(N);
    vector<string> queries(Q);

    for(int i = 0; i < N; ++i) {
        string line;
        getline(cin, line);
        hrml[i] = line;
    }

    for(int i = 0; i < Q; ++i) {
        string line;
        getline(cin, line);
        queries[i] = line;
    }

    //parse hrml
    // tag -> map of attributes of tag to values
    unordered_map<string, unordered_map<string, string>> tags;

    vector<string> stack;

    for(const auto &line: hrml) {
        if(line[1] != '/') {
            //add tag to stack
            int i = 1;
            string tag;
            while(line[i] != ' ' && line[i] != '>') {
                tag += line[i];
                i++;
            }
            stack.push_back(tag);

            //no attributes?
            if(line[i] == '>') {
                continue;
            }

            //build current tag;
            string current_tag;
            current_tag.append(stack[0]);
            for(int k = 1; k < stack.size(); ++k) {
                current_tag += '.';
                current_tag.append(stack[k]);
            }

            //add attributes
            bool first_attr = true;
            while(line[i + 1] != '>') {
                i++;
                if(!first_attr) {
                    i++;
                }
                //parse attr-name
                string attr_name;
                while(line[i] != ' '){
                    attr_name += line[i];
                    ++i;
                }

                //we should be here now
                assert(line[i + 1] == '=');
                i += 4;

                //parse value
                string val;
                while(line[i] != '"') {
                    val += line[i];
                    ++i;
                }

                //add values to structure
                tags[current_tag][attr_name] = val;
                first_attr = false;
            }
        }
        else {
            //this is a closing tag
            //remove last element in stack
            stack.erase(stack.end() - 1);
        }
    }

    //process queries
    for(const auto &q: queries) {
        //parse tag
        int i = 0;
        string tag;
        while(q[i] != '~') {
            tag += q[i];
            ++i;
        }

        //parse attr name
        i++;
        string attr;
        while(i < q.size()) {
            attr += q[i];
            ++i;
        }

        //check and output
        string val = tags[tag][attr];
        if(!val.empty()) {
            cout << val << endl;
        }
        else {
            cout << "Not Found!" << endl;
        }
    }

    return 0;
}
