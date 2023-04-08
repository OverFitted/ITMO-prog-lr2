package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class Disable extends StatusMove {
    public Disable() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "trying to use Disable, but struggles";
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}