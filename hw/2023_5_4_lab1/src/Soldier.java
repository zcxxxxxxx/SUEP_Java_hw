// 编写士兵类及枪类，要求：
// 1）初始士兵叫Ryan，默认有一把AK47;
// 2）士兵可以开火(士兵开火扣动的是扳机);
// 3）枪能够发射子弹(作为参数),有子弹才能射击(要进行是否有子弹的判断);
// 4）枪能够装填子弹，增加子弹的数量.

class Gun {
    private int bulletCount;
    private String name;

    public Gun() {
        name = "AK47";
        bulletCount = 0;
    }

    public Gun(String name) {
        this.name = name;
        bulletCount = 0;
    }

    public void addBullet(int count) {
        bulletCount += count;
    }

    public int getBulletCount() {
        return bulletCount;
    }

    public boolean shoot(int num) {
        if (bulletCount >= num) {
            bulletCount -= num;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }
}

class Soldier {
    private String name;
    private Gun gun;

    public Soldier() {
        name = "Ryan";
        gun = new Gun();
        gun.addBullet(1);
    }

    public Soldier(String name, Gun gun) {
        this.name = name;
        this.gun = gun;
    }

    public void fire() {
        if (gun.shoot(1)) {
            System.out.println(gun.getName() + " " + "Bang!");
            System.out.println(gun.getName() + " " + "Bullet count: " + gun.getBulletCount());
        } else {
            System.out.println(name + " " + "Need to reload!");
        }
    }

    public void reload(int count) {
        gun.addBullet(count);
    }
}
