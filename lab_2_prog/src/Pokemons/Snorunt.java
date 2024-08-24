package Pokemons;

import Moves.SnoruntAndFroslass.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {
    public Snorunt(String name, int level) {
        super(name, level);

        super.setType(Type.ICE);
        super.setStats(50, 50, 50, 50, 50, 50);

        Rest rest = new Rest(0, 0);
        MudSlap mudSlap = new MudSlap(20,100);
        Confide confide = new Confide(0,0);

        super.setMove(rest, mudSlap, confide);
    }
}

