package character;

public class Character {
    private String name;
    private int hp;
    private int attackPower;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public Character(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;

    }

    public void attack(){

    }

}
