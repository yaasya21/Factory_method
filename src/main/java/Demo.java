import character.Character;

public class Demo {
    public static void main(String[] args) {
        Character user1 = new Character("DruidDruidich", ClassFactory.getClass("Druid"));
        user1.talk();

        System.out.println();

        Character user2 = new Character("Fighter for freedom", ClassFactory.getClass("Fighter"));
        user2.talk();
    }
}
