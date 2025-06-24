package Equipables.skill;

import Entities.*;
import Races.Race;

import static java.lang.System.out;

public class AttackSkills extends ActiveSkills{

    public AttackSkills(String name, String grade, String type,String statToBoost, String condition,String skillArea,double mpConsumption)
    {
        super(name,grade,type,statToBoost,condition,skillArea,mpConsumption);
    }

    @Override
    public void performAction(Skills skill, Entity entity){out.println("hello");}
}
