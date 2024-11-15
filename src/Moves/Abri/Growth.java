package Moves.Abri;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public  Growth(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE,1);
        p.addEffect(e);
        Effect g = new Effect().stat(Stat.SPECIAL_ATTACK,1);
        p.addEffect(g);


    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
