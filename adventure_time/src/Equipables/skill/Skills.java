package Equipables.skill;

import Entities.*;
import Misc.Grade;
import static java.lang.System.*;
public abstract class Skills {
    private String name;
    private Grade grade;
    private String type;
    private String condition;

    public void equipTo(Entity entity){
        String[] conditions = getCondition().split(" ");
        if (conditions.length == 2)
        {
            if (conditions[0].substring(0,1).equalsIgnoreCase("R")) {
                String[] races = conditions[1].split(",");
                for (String race : races)
                {
                    if (entity.getRace().getRaceName().equalsIgnoreCase(race))
                    {
                        entity.addSkills(this);
                    }
                    else {
                        out.println("Sorry You cannot Equip this Skill!");
                    }
                }
            }
            else if (conditions[0].substring(0,1).equalsIgnoreCase("C")) {
                String[] archetypes = conditions[1].split(",");
                for (String archetype : archetypes)
                {
                    if (entity.getArchetype().getArchetypeName().equalsIgnoreCase(archetype))
                    {
                        entity.addSkills(this);
                    }
                    else {
                        out.println("Sorry You cannot Equip this Skill!");
                    }
                }
            }
        }
        else if (conditions.length == 3)
        {
            boolean skillEquipped = false;
            String[] races = conditions[1].split(",");
            String[] archetypes = conditions[2].split(",");
            for (String race: races)
            {
                for(String archetype: archetypes)
                {
                    if (entity.getRace().getRaceName().equalsIgnoreCase(race) && entity.getArchetype().getArchetypeName().equalsIgnoreCase(archetype))
                    {
                        entity.addSkills(this);
                        skillEquipped = true;
                    }
                }
            }

            if (!skillEquipped)
            {
                out.println("Sorry You cannot Equip this Skill!");
            }
        }
    }

    public abstract void displaySkillBook();

    public Skills(String name,String grade,String type, String condition) {
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
