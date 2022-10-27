import race.CharacterClass;
import race.Druid;
import race.Fighter;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        return switch (type) {
            case "Druid" -> new Druid();
            case "Fighter" -> new Fighter();
            default -> throw new IllegalArgumentException("Sorry, no type in database: " + type);
        };
    }
}
