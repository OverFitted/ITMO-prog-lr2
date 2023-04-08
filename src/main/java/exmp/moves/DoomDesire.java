package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class DoomDesire extends SpecialMove {

    public DoomDesire() {
        super(Type.STEEL, 140, 100);
    }

    @Override
    protected String describe() {
        return "использует Doom Desire";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect doomDesireEffect = new Effect().turns(2).condition(Status.POISON);
        opp.addEffect(doomDesireEffect);
    }
}
