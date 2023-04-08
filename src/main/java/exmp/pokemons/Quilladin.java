package exmp.pokemons;

import exmp.moves.Disable;
import exmp.moves.FireBlast;
import exmp.moves.Screech;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Quilladin extends Pokemon {
    public Quilladin(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FAIRY);
        setStats(80, 95, 115, 130, 115, 65); // hp, att, def, spec_att, spec_def, speed
        setMove(new FireBlast(), new Disable(), new Screech());
    }
}
