package Entities;

import java.util.*;
import Equipables.skill.*;
import Races.*;
import Archetypes.*;

import static java.lang.System.out;

public abstract class Entity{
    private String name;
    private Race race;
    private String alignment;
    private Archetype archetype;
    private List<Skills> skillList = new LinkedList<>();

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

    public Race getRace() {
        return race;
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

    public Archetype getArchetype() {
        return archetype;
    }

    public void setArchetype(Archetype archetype) {
        this.archetype = archetype;
    }

    public List<Skills> getSkillList() {
        return skillList;
    }

    public void addSkills(Skills skill){
        for (Skills s : skillList)
        {
            if (skill.getName().equalsIgnoreCase(s.getName()))
            {
                if (skill.getGrade().getStatBoost(skill.getGrade().getGradeName()) > s.getGrade().getStatBoost(s.getGrade().getGradeName()))
                {
                    skillList.remove(s);
                    skillList.add(skill);
                }
                else
                {
                    out.println("You have a Skill of higher grade, This Skill will be disposed!");
                }
            }
        }
    }


}
