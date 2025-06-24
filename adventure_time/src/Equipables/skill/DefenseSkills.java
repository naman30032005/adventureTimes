package Equipables.skill;

import Entities.*;
import static java.lang.System.*;
public class DefenseSkills extends ActiveSkills{

    public DefenseSkills(String name, String grade, String type, String statToBoost,String condition,String skillArea,double mpConsumption)
    {
        super(name,grade,type,statToBoost,condition,skillArea,mpConsumption);
    }

    @Override
    public void performAction(Skills skill, Entity entity){out.println("Hello");}
}
