#include <iostream>
#include <deque>
using namespace std;

void printKMax(int arr[], int n, int k){
    //Although this passes the test cases, using a deque might be better as
    //it guarantees at most 2n operations
    //where as this is in the worst case n*k;

    //do first window
    int i = 0;
    int current_max_index = 0;
    for( ; i < k; ++i) {
        if(arr[i] > arr[current_max_index]) {
            current_max_index = i;
        }
    }
    cout << arr[current_max_index] << " ";

    //do the rest

    for( ; i < n; ++i) {
        //check if current max goes out of window range
        if(i - k != current_max_index) {
            //if not, is the new int greater or not?
            if(arr[i] > arr[current_max_index]) {
                current_max_index = i;
                cout << arr[current_max_index] << " ";
            }
            else {
                cout << arr[current_max_index] << " ";
            }
        }
        else {
            //search for the max current window
            int new_current_max_index = i - k + 1;
            for(int j = i - k + 1; j <= i; ++j) {
                if(arr[j] > arr[new_current_max_index]) {
                    new_current_max_index = j;
                }
            }
            current_max_index = new_current_max_index;
            cout << arr[current_max_index] << " ";
        }
    }

    cout << endl;
}

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while(t>0) {
        int n,k;
        cin >> n >> k;
        int i;
        int arr[n];
        for(i=0;i<n;i++)
            cin >> arr[i];
        printKMax(arr, n, k);
        t--;
    }
    return 0;
}
