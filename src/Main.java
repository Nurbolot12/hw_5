public class Main {
    public static void main(String[] args) {
Boss boss = new Boss();
boss.setDmg(20);
boss.setHp(500);
boss.setDefenceType("Magic");
        System.out.println("урон: " + boss.getDmg() + "\nздаровье: " + boss.getHp() + "\nтип:" + boss.getDefenceType());

    }
}