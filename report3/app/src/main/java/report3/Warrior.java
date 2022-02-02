package jp.ac.uryukyu.ie.e215725;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        int damage = (int) (this.attack * 1.5);
        System.out.printf("%sの攻撃!ウェポンスキルを発動!%sに%dのダメージを与えた!\n",this.getName(),opponent.getName(),damage);
        opponent.wounded(damage);
    }
}