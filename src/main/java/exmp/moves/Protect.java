package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class Protect extends StatusMove {

    public Protect() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "uses Protect";
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        Effect protectEffect = new Effect().turns(1).stat(Stat.DEFENSE, 2);
        self.addEffect(protectEffect);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}