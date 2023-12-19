package jp.co.kiramex.games;

public class enemy extends Character {
    private String type; //種別名

    //getter
    public String getType() {
        return type;
    }

    //setter
    public void setType(String type) {
        this.type = type;
    }

    //引数なしのコンストラクタ
    public enemy() {
    }


    //引数ありのコンストラクタ
    public enemy(String name, int hp, int offence, int defence, String type) {
        super(name, hp, offence, defence);
        this.type = type;
    }


}
