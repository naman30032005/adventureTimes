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
    private int money;
    // stats = [Attack(ATK), Defence(DEF), Vitality(VIT), Intelligence(INT),MagicPower(MP), Agility(AGL), Charisma(CHA)]
    private int[] stats = new int[7];
    private int lvl;
    private List<Skills> skillList = new LinkedList<>();

    public Entity(String name, Race race, String alignment, Archetype archetype)
    {
        setName(name);
        setRace(race);
        setAlignment(alignment);
        setArchetype(archetype);
    }


    //addSkills Method to add Skills to the Entity this Method also checks if the Entity already has that Skill if yes removes the skill with lower Grade and adds the skill with higher grade
    public void addSkills(Skills skill){
        boolean skillFound = false;
        for (Skills s : skillList)
        {
            if (skill.getName().equalsIgnoreCase(s.getName()))
            {
                skillFound = true;
                if (skill.getGrade().getStatBoost(skill.getGrade().getGradeName()) > s.getGrade().getStatBoost(s.getGrade().getGradeName()))
                {
                    //out.println("removing skill");
                    skillList.remove(s);
                    //out.println("Adding Skill");
                    skillList.add(skill);
                    break;
                }
                else
                {
                    out.println("You have a Skill of higher grade, This Skill will be disposed!");
                    break;
                }
            }
        }
        if (!skillFound)
        {
            //out.println("Adding Skill");
            skillList.add(skill);
        }
    }







    // Getters and Setters
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int[] getStats() {
        return stats;
    }

    public void setStats(int[] stats) {
        this.stats = stats;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }




}
