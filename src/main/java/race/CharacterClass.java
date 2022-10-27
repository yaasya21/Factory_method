package race;

import java.util.List;

public abstract class CharacterClass {
    protected String name;
    protected int hp;

    public int getHP() {
        return hp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CharacterRace{" +
                "name='" + name + '\'' +
                ", health=" + hp +
                '}';
    }

    public abstract void printMagika();
}
