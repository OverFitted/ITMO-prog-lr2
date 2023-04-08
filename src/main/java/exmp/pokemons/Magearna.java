package exmp.pokemons;

import exmp.moves.FuryAttack;
import exmp.moves.IceBeam;
import exmp.moves.MilkDrink;
import exmp.moves.MiracleEye;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Magearna extends Pokemon {
    public Magearna(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FAIRY);
        setStats(80, 95, 115, 130, 115, 65); // hp, att, def, spec_att, spec_def, speed
        setMove(new FuryAttack(), new MiracleEye(), new IceBeam(), new MilkDrink());
    }
}
