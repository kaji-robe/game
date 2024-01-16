//test

package jp.co.kiramex.games;

public class Character {
    // フィールド
    private String name; // キャラクター名
    private int hp;      // ヒットポイント(HP)
    private int offence; // 攻撃力
    private int defence; // 防御力

    // 引数なしのコンストラクタ（念のため記述しただけなので中身は空でOK）
    public Character() {
    }

    // 引数ありのコンストラクタ
    public Character(String name, int hp, int offence, int defence) {
        this.name = name;
        this.hp = hp;
        this.offence = offence;
        this.defence = defence;
    }

    // 相手に攻撃するメソッド（引数には攻撃する相手のオブジェクトを指定）
    public void attackAction(Character opponent) {
        // 自分の攻撃力と相手の防御力の差をダメージ量とする
        int damage = this.offence - opponent.defence;

        // ダメージ量の計算結果がプラスかどうか
        if (damage > 0) {
            // ダメージ量がプラスならダメージを与える
            opponent.hp = opponent.hp - damage;
            System.out.println(this.name + " は " + opponent.name + " に " + damage + " のダメージを与えた！");
        } else {
            // ダメージ量が0以下ならミスにする
            System.out.println("ミス！ " + this.name + " は " + opponent.name + " にダメージを与えられない！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getOffence() {
        return offence;
    }

    public void setOffence(int offence) {
        this.offence = offence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }


    }
