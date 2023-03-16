import java.lang.Math;


public class App {

    public static void q6(){
        double n = 240, m = 120;
        double mm = Math.pow(m, m);
        double mnn = Math.pow(m, Math.pow(n, n));
        System.out.println(mm); 
        System.out.println(mnn);
    }

    public static void q7(){
        int x = 10, y = 10, z = 10;
        if (x > 9){
            y = 100;
            z = 200;
        }
        else{
            y = -100;
        }
        z = -200;
        System.out.printf("%d, %d, %d %n", x, y, z);
    }

    public static void q8(){
        for (int i = 2; i <= 4; i++){
            switch(i){
                case 1:System.out.printf("%c", 'a');
                case 2:System.out.printf("%c", 'b');break;
                case 3:System.out.printf("%c", 'c');
                case 4:System.out.printf("%c", 'd');break;
            }
        }
    }

    public static void q9(){
        char[] a = {'a','b','c','d','d','e'};
        for (int i = 0; i < a.length / 2; i++){
            char c = a[i];
            a[i] = a[a.length - (i + 1)];
            a[a.length - (i + 1)] = c;
        }
        System.out.printf("%c%c%c%c%c%n",a[0],a[1],a[2],a[3],a[4]);
    }

    public static void q10(){
        int[] a = {3, 4, 1, 2, -6};
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if(a[j] < a[i]){
                    int n = a[j];
                    a[j] = a[i];
                    a[i] = n;
                }
            }
        }
        System.out.printf("%d, %d, %d, %d, %d%n",a[0],a[1],a[2],a[3],a[4]);
    }

    public static double hw4(){
        double j = -1, sum = 0;
        for(int i = 0; i < 10000; i++){
            sum = sum +  Math.pow(j, i) * 1 / (2 * i + 1);
        }
        return sum;
    }

    public static long jiecheng(int n){
        if(n == 1)
            return n;
        else
            return n * jiecheng(n - 1);

    }

    public static long jiecheng2(int n){
        long sum = 1 ,ans = 0;
        for(int i = 1; i < n ; i ++){
            sum = sum * i;
            ans = ans + sum;          
        }
        return ans;
    }

    public static long hw5(){
        long sum = 0;
        for(int i = 100;i < 200;i++){
            sum = sum + jiecheng2(i);
        }
        return sum;
    }

    public static void main(String[] args){
        q6();
        q7();
        q8();
        q9();
        q10();
        System.out.println(hw4());
        System.out.println(hw5());
    }
}

