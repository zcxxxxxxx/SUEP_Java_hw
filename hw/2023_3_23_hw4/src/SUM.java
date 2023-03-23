class SUM {
    double a1,q;
    int flag, n;

    SUM(double A1, double Q, int N, int Flag){
        a1 = A1;
        q = Q;
        n = N;
        flag = Flag;
    };

    public double sum(){
        double ans = 0;
        if(flag == 0){
            ans = a1 * n + q * n * (n - 1) / 2 ;
        }
        else if(flag == 1){
            if(q == 1)
                ans =  a1;
            else
                ans = a1 * (1 - Math.pow(q, n)) / (1 - q);
        }
        return ans;
    }

}
