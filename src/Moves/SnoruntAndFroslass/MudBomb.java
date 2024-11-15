package Moves.SnoruntAndFroslass;

import GlavOS.Home;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MudBomb extends SpecialMove {
    public  MudBomb(double pow, double acc){
        super(Type.GROUND, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Home.chance(0.1)){
            p.setMod(Stat.ACCURACY, -1);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
