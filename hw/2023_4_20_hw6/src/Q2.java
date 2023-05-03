
class Animal {
    private int legs = 0;
    private static int counts = 0;
    private String name;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setKinds(String name) {
        this.name = name;
    }

    public String getKinds() {
        return name;
    }

    public static int getCount() {
        return counts;
    }

}

class fish extends Animal {
    private static int counts = 0;

    fish() {
        counts++;
        setKinds("fish");
        setLegs(0);
    }

    public static int getCount() {
        return counts;
    }
}

class tiger extends Animal {
    private static int counts = 0;

    tiger() {
        counts++;
        setKinds("tiger");
        setLegs(4);
    }

    public static int getCount() {
        return counts;
    }
}

class SouthEastTiger extends tiger {
    private static int counts = 0;

    SouthEastTiger() {
        counts++;
        setKinds("SouthEastTiger");
        setLegs(4);
    }

    public static int getCount() {
        return counts;
    }
}