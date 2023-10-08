public class Matriz {
    int n,m;
    double [][] M;

    Matriz somaMatriz(Matriz B){
        if(n!=B.n || m!= B.m){
            return null;
        }
        Matriz C = new Matriz(n,m);
        for(int h=0; h<n; h++){
            for(int j=0;j<m;j++){
                C.M[h][j]+= M[h][j] + B.M[h][j];
            }
        }
        return C;
    }
    
    Matriz multiplicaMatriz(Matriz B){
        if(m !=B.n){
            return null;
        }
        Matriz C=new Matriz(n, B.m);
        for(int k=0;k<n;k++){
            for(int l=0;l<B.m;l++){
                for(int x=0;x<m;x++){
                    C.M[k][l] += M[k][x] * B.M[x][l];
                }
            }
        }
        return C;
    }

    void imprimeMatriz(){ 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    Boolean ehQuadrada(){
        return n==m;
    }

    void copiaMatriz(double [][] valores){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                M[i][j]= valores[i][j];
            }
        }

    }
    Matriz (double [][] valores){
        n= valores.length;
        m=valores[0].length;
        M= new double[n][m];
        copiaMatriz(valores);
    }
    Matriz(int n_, int m_){
        n = n_;
        m = m_;
        M = new double[n][m];
    }

}