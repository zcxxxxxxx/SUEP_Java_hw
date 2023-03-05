public class hw2_1{
    public static void main (String args[ ]){
        char un = '\u0400';
        while(un != '\u044F'){  
            System.out.print(" " + un);          
            un = (char)(un + 1);
        }
    }
}