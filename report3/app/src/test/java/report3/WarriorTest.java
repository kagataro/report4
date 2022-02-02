package jp.ac.uryukyu.ie.e215758;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * 3回攻撃して、3回ともattackの150%の攻撃ができているか検証する。
     * 検証手順
     * (1) ヒーローと敵を準備。
     * (2) ヒーローがウェポンスキルを3回発動する。
     * (3) 1回のスキル発動で、150ダメージを与えられるはず。
     * ヒーローがウェポンスキルを3回発動したら、150ダメージが3回あたえられることを期待。これを検証する。
     */
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
        int defaultEnemyHp = 1000;
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 100);
        for (int i = 0; i < 3; i++) {
            int nowEnemyHP = slime.hitPoint;
            demoHero.attackWithWeponSkill(slime);
            assertEquals(150, (nowEnemyHP - slime.hitPoint));
        }
    }
}