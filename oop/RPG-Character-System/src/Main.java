import character.Mage;
import character.Warrior;

void main() {
    Warrior warrior = new Warrior("전사", 100, 20);
    Mage mage = new Mage("마법사", 80, 15);

    warrior.attack();
    mage.attack();
}
