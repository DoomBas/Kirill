package Moves.Yveltal;

import GlavOS.Home;
import ru.ifmo.se.pokemon.*;

import javax.swing.text.html.HTMLDocument;

public class FocusEnergy extends SpecialMove {

    public  FocusEnergy(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPEED,1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
