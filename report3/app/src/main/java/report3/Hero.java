package jp.ac.uryukyu.ie.e215758;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <= 0) {
            this.dead = isDead();
            System.out.printf("勇者%sは倒れた\n", getName());
        }
    }
}