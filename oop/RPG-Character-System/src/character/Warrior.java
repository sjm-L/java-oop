package character;

public class Warrior extends Character {
    public Warrior(String name, int hp, int attackPower){
        super(name, hp, attackPower);
    }

    @Override
    public void attack(){
        System.out.println(getName()+"(체력" + getHp() +", 공격력"+ getAttackPower()+")가 마법으로 공격합니다!");
    }
}
