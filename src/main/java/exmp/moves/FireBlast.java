package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.BURN));
    }

    @Override
    protected String describe() {
        return "uses Fire Blast";
    }
}
