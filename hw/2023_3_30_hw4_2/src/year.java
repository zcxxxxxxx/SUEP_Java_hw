class year {
    int num;
    year(int i){
        num = i;
    }
    public void is_Leap_Year(){
        if(num % 4 == 0 & num % 100 != 0)
            System.out.println(num + " " + "is common Leap Year");
        else if(num % 100 == 0 & num % 400 != 0)
            System.out.println(num + " " + "is century Leap Year");
        else 
        System.out.println(num + " " + "not Leap Year");

    }
}
