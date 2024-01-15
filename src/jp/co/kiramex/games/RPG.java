package jp.co.kiramex.games;

public class RPG {

    public static void main(String[] args) {
        hero hero = new hero("勇者", 10, 5, 3, 1);
        enemy slime = new enemy("スライム", 5, 2, 2, "ぽにょ");

        hero.attackAction(slime); //勇者がスライムに攻撃する
        slime.attackAction(hero); //スライムが勇者に攻撃する

        hero.magic_attack(slime);
    }

}
