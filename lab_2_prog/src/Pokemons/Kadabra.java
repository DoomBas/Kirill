package Pokemons;

import Moves.Abri.Growth;
import Moves.Abri.PoisonPowder;
import Moves.Abri.SludgeBomb;
import ru.ifmo.se.pokemon.Type;

public class Kadabra extends Abra {
    public Kadabra(String name, int level) {
        super(name, level);

        super.setType(Type.PSYCHIC);
        super.setStats(40, 35, 30, 120, 70, 105);

        PoisonPowder poisonPowder = new PoisonPowder(0, 75);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        Growth growth = new Growth(0, 0);

        super.setMove(poisonPowder, sludgeBomb, growth);

    }
}
