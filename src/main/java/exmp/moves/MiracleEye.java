package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class MiracleEye extends StatusMove {

    public MiracleEye() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected String describe() {
        return "использует Miracle Eye";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect miracleEyeEffect = new Effect().turns(-1).condition(Status.NORMAL);
        opp.addEffect(miracleEyeEffect);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}
