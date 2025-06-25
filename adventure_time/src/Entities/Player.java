package Entities;

import Archetypes.*;
import Races.*;

public class Player extends Entity{
    public Player(String name, Race race, String alignment, Archetype archetype)
    {
        super(name, race, alignment,archetype);
        setMoney(0);
        setLvl(1);
    }

}
