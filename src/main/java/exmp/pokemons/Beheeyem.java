package exmp.pokemons;


import exmp.moves.DynamicPunch;
import exmp.moves.Protect;
import exmp.moves.DoomDesire;
import exmp.moves.SuperFang;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Beheeyem extends Pokemon {
    public Beheeyem(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FAIRY);
        setStats(80, 95, 115, 130, 115, 65); // hp, att, def, spec_att, spec_def, speed
        setMove(new DynamicPunch(), new Protect(), new DoomDesire(), new SuperFang());
    }
}
