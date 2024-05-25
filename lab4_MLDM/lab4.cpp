#include <iostream> 
#include <vector> 
#include <cmath> 
#include <algorithm>
#include <iomanip>

using namespace std;

int main() { 
    ios_base::sync_with_stdio(false); cin.tie(0);
    int size;
    int temp;
    int min_index;
    int min;    
    int distanceI,distanceJ;

    cout <<"Input size graph" << endl;;
    cin >> size;
   

   vector<vector<int>> matricsConnect(size,vector<int>(size));
   vector<int>distance(size);
   vector<int>top(size);

  
   cout << "Input distanse" << endl;
   for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            cout << i + 1<< "-" << j + 1 << endl;
            cin >> temp;
            matricsConnect[i][j] = temp;
        }
   }


   // matricsConnect[0][0] = 0; // если пользователь случайно введет размер ребра 1-1

    cout << "Output matrics" << endl;
    for(int i = 0; i < size; i++){
        for(int j = 0; j < size; j++){
            cout << fixed << setw(3) << matricsConnect[i][j];
        }
        cout << "\n";
   }

    for(int i = 0 ; i <= size; i++){
        distance[i] = 10000;
        top[i] = 1;
    }
    distance[0] = 0;
    
    cout << "Input distanse" << endl;
    cin >> distanceI >> distanceJ;

    if(distanceI <= 0 || distanceJ >= size+1 ){
        cout << "ERROR!";
        return 0;
    }

    if(distanceJ < distanceI)
        swap(distanceJ,distanceI);

    do{
        min_index = 10000;
        min = 10000;
        for(int i = 0; i < size;i++){
            if((top[i] == 1) && (distance[i] < min)){
                min = distance[i];
                min_index = i;
            }
        }
        if(min_index != 10000){
            for(int i = distanceI; i < distanceJ; i++){
                if(matricsConnect[min_index][i] > 0)
                    temp = min + matricsConnect[min_index][i];
                    if(temp < distance[i])
                        distance[i] = temp;
            }
            top[min_index] = 0;
        }
    }while(min_index < 10000);
    
    cout << "Size distanse:  " << distanceI << " <--> " << distanceJ << " = " << distance[distanceJ - 1] << endl;


    vector<int>ver(size);
    int end = distanceJ - distanceI;
    ver[0] = end + 1;
    int k = 1;
    int weight = distance[end];

    while(end != 0){
        for(int i = 0 ; i < size;i++){
            if (matricsConnect[i][end] != 0){
                int t = weight - matricsConnect[i][end] ;
                if(t == distance[i]){
                    weight = t;
                    end = i;
                    ver[k] = i + 1;
                    k++;
                }
            }
        }
    }
    cout << "Output the shortest distance" << endl;
    for (int i = k - 1; i >= 0; i--)
        cout << fixed << setw(3) << ver[i];

    return 0;
}