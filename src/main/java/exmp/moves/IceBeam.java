package exmp.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.freeze(p);
        p.setMod(Stat.ACCURACY, 0);
    }

    @Override
    protected String describe() {
        return "uses Ice Beam";
    }
}