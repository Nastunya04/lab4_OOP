package lotr;

import kick.KnightStrategy;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2, new KnightStrategy());
    }
}

