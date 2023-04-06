public class GCD {
    int big,small;
    GCD(int num1,int num2){
        which_bigger(num1, num2);
    }
    public int how_much(){
        int ans = 0;
        while(true){
            ans = big % small;

            big = small;
            small = ans;
            if(ans == 0 || small == 1)
                break;
        }
        return big;
    }
    private void which_bigger(int num1, int num2){
        if(num1 < num2){
            big = num2;
            small = num1;
        }
        else{
            big = num1;
            small = num2;
        }
    }
}
