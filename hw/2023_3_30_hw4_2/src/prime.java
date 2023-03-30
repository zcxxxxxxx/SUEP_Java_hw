class prime {
    int num;
    prime(int i){
        num = i;
    }
    public void is_prime(){
        int flag = 0;
        if(num <= 1)
            System.out.println(num + " " + "is not prime");
        for(int i = 2;i < num; i ++){
            if(num % 2 == 0){
                System.out.println(num + " " + "is not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println(num + " " + "is prime");
    }
}
