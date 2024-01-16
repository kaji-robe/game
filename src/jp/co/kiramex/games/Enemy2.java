package jp.co.kiramex.games;

public class Enemy2 extends Character {
    private String type; //種別

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Enemy2() {

    }

    public Enemy2(String name, int hp, int offence, int defense, String type) {
        super(name, hp, offence, defense);
        this.type = type;

    }


}
