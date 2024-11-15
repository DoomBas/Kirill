package Pokemons;


import Moves.PatternMoves;
import Moves.Yveltal.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.awt.image.SampleModel;

public class Yveltal extends Pokemon {
    public Yveltal(String name, int level){
        super(name, level);

        super.setType(Type.DARK, Type.FLYING);
        super.setStats(126,131,95,131,98,99);


        FocusEnergy focusEnergy = new FocusEnergy(0, 0);
        AuroraBeam auroraBeam = new AuroraBeam(65, 100);
        GunkShot gunkShot = new GunkShot(120, 80);
        ChargeBeam chargeBeam = new ChargeBeam(50, 90);

        super.setMove(gunkShot, auroraBeam, chargeBeam,focusEnergy);//FocusEnergy

    }
}
