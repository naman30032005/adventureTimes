package Entities;

import Races.*;
import Archetypes.*;

public class Enemy extends Entity{

    public Enemy(String name, Race race, String alignment, Archetype archetype)
    {
        super(name,race,alignment,archetype);
    }
}
