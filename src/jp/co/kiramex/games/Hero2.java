package jp.co.kiramex.games;

public class Hero2 extends Character {
    private int Weapon; //武器の強さ

    public int getWeapon() {
        return Weapon;
    }

    public void setWeapon(int weapon) {
        Weapon = weapon;
    }

    //引数なしのコンストラクタ
    public Hero2() {

    }

    //引数有りのコンストラクタ
    public Hero2(String name, int hp ,int offence, int defense,int weapon) {
        super(name, hp, offence, defense);
        this.Weapon = weapon;

    }



}
