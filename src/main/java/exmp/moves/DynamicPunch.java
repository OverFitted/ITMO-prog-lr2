package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class DynamicPunch extends PhysicalMove {
    public DynamicPunch() {
        super(Type.FIGHTING, 100, 50);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.confuse();
        Effect e = new Effect().chance(1. / 3).attack(40).turns((int) (1 + Math.random() * 5));
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Dynamic Punch";
    }
}
