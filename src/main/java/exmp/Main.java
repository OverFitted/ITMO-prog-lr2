package exmp;

import exmp.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon[] allies = {
                new exmp.pokemons.Beheeyem("Bob", 30),
                new exmp.pokemons.Chesnaught("Zen", 20),
                new exmp.pokemons.Chespin("Zinc", 40),
                new exmp.pokemons.Elgyem("Doodle", 20),
                new exmp.pokemons.Magearna("Double", 40),
                new exmp.pokemons.Quilladin("Hydra", 70)
        };
        Pokemon[] foes = {
                new exmp.pokemons.Beheeyem("Ben", 30),
                new exmp.pokemons.Chesnaught("Zoom", 20),
                new exmp.pokemons.Chespin("Zetta", 40),
                new exmp.pokemons.Elgyem("Debby", 20),
                new exmp.pokemons.Magearna("Doom", 40),
                new exmp.pokemons.Quilladin("Howl", 70)
        };

        for(Pokemon ally : allies)
            b.addAlly(ally);
        for(Pokemon foe : foes)
            b.addFoe(foe);

        b.go();
    }
}
