package jp.ac.uryukyu.ie.e215758;

public class LivingThing {
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;

    /**
     * コンストラクタ.名前、最大HP、攻撃力を指定する.
     * 
     * @param name     (勇者 or エネミー)の名前
     * @param hitPoint (勇者 or エネミー)の最大HP
     * @param attack   (勇者 or エネミー)の攻撃力
     */
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", this.name, this.hitPoint, this.attack);
    }

    public void attack(LivingThing opponent) {
        if (this.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃!%sに%dのダメージ\n", this.name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <= 0) {
            this.dead = isDead();
            System.out.printf("%sは倒れた\n", this.name);
        }
    }

    /**
     * (勇者 or エネミー) が死亡したかどうか判定するメソッド
     * 
     * @return 死亡判定
     */
    public boolean isDead() {
        return this.dead = true;
    }

    /**
     * (勇者 or エネミー)の名前を取得するメソッド
     * 
     * @return (勇者 or エネミー) の名前
     */
    public String getName() {
        return this.name;
    }

}