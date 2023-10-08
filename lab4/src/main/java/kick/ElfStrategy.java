package kick;

import lotr.Character;

public class ElfStrategy implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getPower() < whoKick.getPower()) {
            opponent.setHp(0);
        }
        else {
            whoKick.setPower(whoKick.getPower() - 1);
        }
    }
}
