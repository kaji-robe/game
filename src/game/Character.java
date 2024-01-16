package game;

public class Character {
    // フィールド
    public String name; // キャラクター名
    public int hp;      // ヒットポイント(HP)
    public int offense; // 攻撃力
    public int defense; // 防御力

    // 引数なしのコンストラクタ（念のため記述しただけなので中身は空でOK）
    public Character() {
    }

    // 引数ありのコンストラクタ
    public Character(String name, int hp, int offense, int defense) {
        this.name = name;
        this.hp = hp;
        this.offense = offense;
        this.defense = defense;
    }

    // 相手に攻撃するメソッド（引数には攻撃する相手のオブジェクトを指定）
    public void attack(Character opponent) {
        // 自分の攻撃力と相手の防御力の差をダメージ量とする
        int damage = this.offense - opponent.defense;

        // ダメージ量の計算結果がプラスかどうか
        if(damage > 0) {
            // ダメージ量がプラスならダメージを与える
            opponent.hp = opponent.hp - damage;
            System.out.println(this.name + " は " + opponent.name + " に " + damage + " のダメージを与えた！");
        } else {
            // ダメージ量が0以下ならミスにする
            System.out.println("ミス！ " + this.name + " は " + opponent.name + " にダメージを与えられない！");
        }
    }
}
