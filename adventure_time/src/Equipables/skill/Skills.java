package Equipables.skill;

import Entities.*;
import Misc.Grade;
public abstract class Skills {
    private String name;
    private Grade grade;
    private String type;
    private String condition;

    public abstract boolean equipTo(Player player);

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
