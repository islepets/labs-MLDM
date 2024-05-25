#include <iostream> 
#include <vector> 
#include <cmath> 
#include <algorithm>
#include <iomanip>

using namespace std;


/*
0 1 1 0
0 0 1 1
0 0 0 0
1 0 0 0
*/

//  Алгоритм Уоршеллаы
vector<vector<int>> f(vector<vector<int>>&matrixS){
    int n = matrixS.size();
    for(int k = 0; k < n; k++){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                matrixS[i][j] = matrixS[i][j] || (matrixS[i][k] && matrixS[k][j]);
            }
        }
    }

    return matrixS;
}


int main() { 
    ios_base::sync_with_stdio(false); 
    cin.tie(0);

    int size;
    cin >> size;

    vector<vector<int>> matrixS(size, vector<int>(size));

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            cin >> matrixS[i][j];
        }
    }
    cout << endl;
    vector<vector<int>>res;
    res = f(matrixS);
    for(int i = 0; i < res.size();i++){
        res[i][i] = 1;
        for(int j = 0; j < res.size();j++){
            cout << res[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}

