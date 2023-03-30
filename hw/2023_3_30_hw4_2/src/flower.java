class flower {
    public void calcuate(){
        for(int i = 0;i < 10;i++)
            for(int j = 0;j < 10;j++)
                for(int z = 0;z < 10;z++)
                    if((Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(z, 3)) == (i * 100 + j * 10 + z) && (i * 100 + j * 10 + z) != 1 && (i * 100 + j * 10 + z) != 0)
                        System.out.println(i * 100 + j * 10 + z);
                      
    }
    
}
