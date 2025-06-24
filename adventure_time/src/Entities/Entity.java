package Entities;

import Races.*;
import Archetypes.*;
public abstract class Entity{
    private String name;
    private Race race;
    private String alignment;
    private Archetype archetype;

    public Entity(String name, Race race, String alignment, Archetype archetype)
    {
        setName(name);
        setRace(race);
        setAlignment(alignment);
        setArchetype(archetype);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race.getRaceName();
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getArchetype() {
        return archetype.getArchetypeName();
    }

    public void setArchetype(Archetype archetype) {
        this.archetype = archetype;
    }

}
