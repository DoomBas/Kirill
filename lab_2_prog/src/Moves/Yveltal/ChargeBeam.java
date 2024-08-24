package Moves.Yveltal;

import GlavOS.Home;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public  ChargeBeam(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        if (Home.chance(0.7)){
            Effect e = new Effect().stat(Stat.SPECIAL_ATTACK,1);
            p.addEffect(e);
        }

    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
