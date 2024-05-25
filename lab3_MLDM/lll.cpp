#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool isFunction(const vector<pair<int,int>>& relation, const vector<int>& A){
     vector<int> domain;
    for (const auto& pair : relation) {
        if (find(domain.begin(), domain.end(), pair.first) == domain.end()) {
            domain.push_back(pair.first);
        }
        if(find(A.begin(), A.end(), pair.first) == A.end()){
            return false;
        }
    }
    return domain.size() == A.size();
}

bool isInjectivity(const vector<pair<int,int>>& relation){ 
    vector<int> domain;
    for(const auto& pair: relation){
        if(find(domain.begin(), domain.end(), pair.second) != domain.end())
            return false;
        domain.push_back(pair.second);
    }
    return true;
}

bool isSurjectivity(const vector<pair<int,int>>& relation, vector<int>B){ 
    vector<int> domain;
    for (const auto& pair : relation) {
        if (find(domain.begin(), domain.end(), pair.second) == domain.end()) {
            domain.push_back(pair.second);
        }
    }
    return domain.size() == B.size();
}

int main() {
    cout << "Enter the number of elements of the set A" << endl;
    int n; cin >> n;
    
    cout << "Enter the elements of set A" << endl;
    vector<int> A(n);
    for(int i = 0; i < n; i++){
        cin >> A[i];
    }

    cout << "Enter the number of elements of the set B" << endl;
    int m; cin >> m;

    cout << "Enter the elements of set B" << endl;
    vector<int> B(m);
    for(int i = 0; i < m; i++){
        cin >> B[i];
    }

    cout << "Enter the number of pairs in the relation" << endl;
    int pairs; cin >> pairs;
    
    cout << "Enter the pairs in the relation" << endl;
    vector<pair<int,int>> relation(pairs);
    for(int i = 0; i < pairs; i++){
        cin >> relation[i].first >> relation[i].second;
    }

    if(isFunction(relation, A)){
        if(isInjectivity(relation) && isSurjectivity(relation,B))
            cout << "Bijective";
        else if(isInjectivity(relation))
            cout <<"Injective";
        else if(isSurjectivity(relation,B))
            cout << "Surjective";
        else
            cout << "Neither Injective nor Surjective";
    }
    else {
        cout << "Error: Not a function";
    }
    return 0;
}