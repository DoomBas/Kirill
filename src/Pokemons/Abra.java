package Pokemons;

import Moves.Abri.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Abra extends Pokemon {
    public Abra(String name, int level) {
        super(name, level);

        super.setType(Type.PSYCHIC);
        super.setStats(25,20,15,105,55,90);

        PoisonPowder poisonPowder = new PoisonPowder(0, 75);
        SludgeBomb sludgeBomb = new SludgeBomb(90,100);

        super.setMove(poisonPowder, sludgeBomb);

    }
}
