package Moves.SnoruntAndFroslass;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public  Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.restore();
        Effect effect = new Effect();
        effect.turns(2);
        effect.condition(Status.SLEEP);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
