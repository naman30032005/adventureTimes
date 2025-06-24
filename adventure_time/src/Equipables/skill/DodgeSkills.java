package Equipables.skill;

import Entities.Entity;
import Entities.Player;

import static java.lang.System.out;

public class DodgeSkills extends ActiveSkills{
    public DodgeSkills(String name, String grade, String type,String statToBoost, String condition,String skillArea,double mpConsumption)
    {
        super(name,grade,type,statToBoost,condition,skillArea,mpConsumption);
    }

    @Override
    public boolean equipTo(Player player){
        String[] conditions = getCondition().split(" ");
        if (conditions.length == 2)
        {
            String[] races = conditions[1].split(",");
            for (String race : races)
            {
                if (player.getRace().equalsIgnoreCase(race))
                {
                    return true;
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
                    if (player.getRace().equalsIgnoreCase(race) && player.getArchetype().equalsIgnoreCase(archetype))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    @Override
    public void performAction(Skills skill, Entity entity){out.println("hello");}
}
