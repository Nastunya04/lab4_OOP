package lotr;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        List<Class<? extends Character>> characters = List.of(Hobbit.class, Knight.class, King.class, Elf.class);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }
}
