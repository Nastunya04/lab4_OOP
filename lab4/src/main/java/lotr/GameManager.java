package lotr;
import lotr.Character;
public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("The fight has started between 2 mysterious Characters");
        System.out.println("-----------------------------------------------------");
        Character_1(c1);
        Character_2(c2);

        while (c1.getHp() > 0 && c2.getHp() > 0) {
            c1.kick(c2);
            System.out.println("-----------------------------------------------------");
            System.out.println("After the kick from first Character Characters' attributes are:");
            Character_1(c1);
            Character_2(c2);
            if (!c2.isAlive()) {
                System.out.println("Character 1 won the battle!");
                break;
            }
            c2.kick(c1);
            System.out.println("-----------------------------------------------------");
            System.out.println("After the kick from second Characters' attributes are:");
            Character_1(c1);
            Character_2(c2);
            if (!c1.isAlive()) {
                System.out.println("Character 2 won the battle!");
                break;
            }
            if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
                System.out.println("Both characters are hobbits. Ending the fight.");
                break;}
        }

    }
    private static void Character_1 (Character character_1){
        System.out.println("The first Character is " + character_1.getClass().getSimpleName());
        System.out.println("His hp is " + character_1.getHp() + " and his power is " + character_1.getPower() + ".");
        System.out.println("-----------------------------------------------------");
    }
    private static void Character_2 (Character character_2){
        System.out.println("The second Character is " + character_2.getClass().getSimpleName());
        System.out.println("His hp is " + character_2.getHp() + " and his power is " + character_2.getPower() + ".");
        System.out.println("-----------------------------------------------------");

    }
    public static void main(String[] args) {
        // Example usage of the GameManager
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();

        fight(character1, character2);
    }
}