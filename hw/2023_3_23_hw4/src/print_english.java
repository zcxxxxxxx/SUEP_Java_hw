class print_english {
    public void Positive(){
        char un = 'a';
        while(un != 'z' + 1){  
            System.out.print(" " + un);          
            un = (char)(un + 1);
        }
        un = 'A';
        while(un != 'Z' + 1){  
            System.out.print(" " + un);          
            un = (char)(un + 1);
        }
    }

    public void reverse(){
        char un = 'Z';
        while(un != 'A' - 1){  
            System.out.print(" " + un);          
            un = (char)(un - 1);
        }
        un = 'z';
        while(un != 'a' - 1){  
            System.out.print(" " + un);          
            un = (char)(un - 1);
        }
    }
}
