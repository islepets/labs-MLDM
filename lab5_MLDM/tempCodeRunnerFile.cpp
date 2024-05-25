 res = f(matrixS);
    for(int i = 0; i < res.size();i++){
        res[i][i] = 1;
        for(int j = 0; j < res.size();j++){
            cout << res[i][j] << " ";
        }
        cout << endl;
    }