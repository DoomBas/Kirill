package Pokemons;

import Moves.SnoruntAndFroslass.Confide;
import Moves.SnoruntAndFroslass.MudBomb;
import Moves.SnoruntAndFroslass.MudSlap;
import Moves.SnoruntAndFroslass.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Froslass extends Snorunt {
    public Froslass(String name, int level) {
        super(name, level);

        super.setType(Type.ICE);
        super.setStats(70, 80, 70, 80, 70, 110);

        Rest rest = new Rest(0, 0);
        MudSlap mudSlap = new MudSlap(20, 100);
        Confide confide = new Confide(0, 0);
        MudBomb mudBomb = new MudBomb(65, 85);

        super.setMove(rest, mudSlap, confide, mudBomb);
    }
}
    