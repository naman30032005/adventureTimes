package Equipables.skill;

import Entities.*;
import Misc.Grade;
public abstract class Skills {
    private String name;
    private Grade grade;
    private String type;
    private String condition;

    public void equipTo(Player player){
        String[] conditions = getCondition().split(" ");
        if (conditions.length == 2)
        {
            if (conditions[0].substring(0,1).equalsIgnoreCase("R")) {
                String[] races = conditions[1].split(",");
                for (String race : races)
                {
                    if (player.getRace().getRaceName().equalsIgnoreCase(race))
                    {
                        player.addSkills(this);
                    }
                }
            }
            else if (conditions[0].substring(0,1).equalsIgnoreCase("C")) {
                String[] archetypes = conditions[1].split(",");
                for (String archetype : archetypes)
                {
                    if (player.getArchetype().getArchetypeName().equalsIgnoreCase(archetype))
                    {
                        player.addSkills(this);
                    }
                }
            }
        }
        else if (conditions.length == 3)
        {
            String[] races = conditions[1].split(",");
            String[] archetypes = conditions[2].split(",");
            for (String race: races)
            {
                for(String archetype: archetypes)
                {
                    if (player.getRace().getRaceName().equalsIgnoreCase(race) && player.getArchetype().getArchetypeName().equalsIgnoreCase(archetype))
                    {
                        player.addSkills(this);
                    }
                }
            }
        }
    }

    public abstract void displaySkillBook();

    public abstract void performAction(Skills skill, Entity entity);

    public Skills(String name,String grade,String type, String condition)
    {
        setName(name);
        setGrade(new Grade(grade));
        setType(type);
        setCondition(condition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
