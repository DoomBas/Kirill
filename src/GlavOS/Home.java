package GlavOS;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Home {
    public static void main(String[] args) {
        Battle b = new Battle();
        Yveltal yveltal = new Yveltal( "Yveltal", 1 );
        Snorunt snorunt = new Snorunt( "Snorunt", 1 );
        Froslass froslass = new Froslass( "Froslass", 1);
        Abra abra = new Abra("Abra",1);
        Kadabra kadabra = new Kadabra("Kadabra",1);
        Alakazam alakazam = new Alakazam("Alakazam",1);
        b.addFoe(kadabra);
        b.addFoe(alakazam);
        b.addAlly(froslass);
        b.addFoe(abra);
        b.addAlly(yveltal);
        b.addAlly(snorunt);
        b.go();
    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}