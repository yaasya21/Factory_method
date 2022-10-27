package character;

import race.CharacterClass;

public class Character {
    private String name;
    private int hp;
    private CharacterClass race;
    private Stats attributes;

    public Character(String name, CharacterClass race) {
        this.name = name;
        this.race = race;
        this.attributes = Stats.generate();
        this.hp = (int) (race.getHP() + Math.floor(attributes.getConstitution()/2) - 5); // as addRaceBonuses(no need to add function here)
    }

    public void talk(){
        System.out.printf("Name:" + name + " Class: " + race.getName());
        System.out.println("\n----Attributes----");
        attributes.getStats().entrySet().forEach(System.out::println);
        System.out.println("----------");
        race.printMagika();
        System.out.println("His HP is " + hp);
    }

}