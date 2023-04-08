package exmp;

import exmp.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon[] allies = {
                new exmp.pokemons.Beheeyem("Nelson", 40),
                new exmp.pokemons.Chesnaught("Mata", 20),
                new exmp.pokemons.Chespin("Priya", 15),
                new exmp.pokemons.Elgyem("Seren", 40),
                new exmp.pokemons.Magearna("Fabio", 40),
                new exmp.pokemons.Quilladin("Andre", 73)
        };
        Pokemon[] foes = {
                new exmp.pokemons.Beheeyem("Brett", 40),
                new exmp.pokemons.Chesnaught("Kelly", 25),
                new exmp.pokemons.Chespin("Zackary", 15),
                new exmp.pokemons.Elgyem("Daniyal", 25),
                new exmp.pokemons.Magearna("Milly", 45),
                new exmp.pokemons.Quilladin("Vera", 70)
        };

        for(Pokemon ally : allies)
            b.addAlly(ally);
        for(Pokemon foe : foes)
            b.addFoe(foe);

        b.go();
    }
}
