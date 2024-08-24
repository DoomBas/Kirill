package Moves.Yveltal;

import GlavOS.Home;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class AuroraBeam extends SpecialMove {

    public  AuroraBeam(double pow, double acc){
        super(Type.ICE, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Home.chance(0.1)){
            p.setMod(Stat.ATTACK, -1);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
