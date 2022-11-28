public class Hero {
    private int hp = 350;
    private int dmg = 30;

    private String superPower;

    public Hero(int hp, int dmg, String superPower) {
        this.hp = hp;
        this.dmg = dmg;
        this.superPower = superPower;
    }

    public Hero(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public String getSuperPower() {
        return superPower;
    }
}

