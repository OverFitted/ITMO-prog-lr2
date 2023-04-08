package exmp.moves;

import ru.ifmo.se.pokemon.*;

public class MilkDrink extends StatusMove {
    public MilkDrink() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect heal = new Effect();
        heal.stat(Stat.HP, (int) pokemon.getStat(Stat.HP) + (int) pokemon.getStat(Stat.HP) / 2);
        pokemon.setCondition(heal);
    }

    @Override
    protected String describe() {
        return "uses MilkDrink";
    }
}
