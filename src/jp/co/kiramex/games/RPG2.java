package jp.co.kiramex.games;

public class RPG2 {

    public static void main(String[] args) {
        Hero2 hero = new Hero2("勇者", 10, 5, 3, 1);
        Enemy2 slime = new Enemy2("スライム", 5, 2, 2, "ぽにょ");

        hero.attackAction(slime); //勇者がスライムに攻撃する
        slime.attackAction(hero); //スライムが勇者に攻撃する

    }

}
